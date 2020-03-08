/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Fungsi.DataBaseConnection;
import Fungsi.LoginFunction;
import Fungsi.function;
import Tools.AdminID;
import Tools.AdminLogin;
import Tools.CustomerLogin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;


/**
 *
 * @author ASUS
 */
public class login1 extends HttpServlet {


    


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        DataBaseConnection conn = new DataBaseConnection();
        Connection connect = conn.getConnection();
        
        String username = request.getParameter("username");
        String nama = request.getParameter("nama");
        String password = request.getParameter("password");
        
        CustomerLogin loginf = new CustomerLogin();
        AdminLogin loginAdm = new AdminLogin();
        loginf.setUsername(username);
        loginf.setPassword(password);
        loginAdm.setUsername(username);
        loginAdm.setPassword(password);
        boolean status = false;
        HttpSession session = request.getSession();
        function f = new function();
        
        try {
            if (f.validateCustomer(loginf)) {
                String query = "select * from customer where username='" + username + "'";
                Statement statement = conn.getConnection().createStatement();
                ResultSet res = statement.executeQuery(query);
                if (res.next()) {
                    String namaquery = res.getString(2);
                    session.setAttribute("nama", namaquery);
                }
                
                response.sendRedirect("halutLogin1");
            } else if (f.validateAdmin(loginAdm)) {
                String query = "select * from admin where username='" + username + "'";
                Statement statement = conn.getConnection().createStatement();
                ResultSet res = statement.executeQuery(query);
                if (res.next()) {
                    String namaquery = res.getString(2);
                    session.setAttribute("nama", namaquery);
                }
                
                response.sendRedirect("admin.jsp");
            } else {
                out.println("<html>");
                out.println("<script>");
                out.println("alert(\"Login Gagal\")");
                out.println("</script>");
                
                response.sendRedirect("login.jsp");
            }
            
        } catch (Exception ex) {
            out.print("message: " + ex.getMessage());
        }
        
        out.close();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>



}
