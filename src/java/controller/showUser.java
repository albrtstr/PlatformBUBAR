/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Fungsi.DataBaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.rpl.CostumerID;
import org.rpl.WsRpl_Service;

/**
 *
 * @author ASUS
 */
public class showUser extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/wsRpl/wsRpl.wsdl")
    private WsRpl_Service service;

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
            out.println("<title>Servlet showUser</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet showUser at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html");

        List<CostumerID> data = showUser();

        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<body>");
        out.print("<center><table border=3>");
        out.print("<tr>");
        out.print("<td>ID Akun</td>");
        out.print("<td>Nama</td>");
        out.print("<td>Username</td>");
        out.print("<td>Password</td>");
        out.print("<td>Alamat</td>");
        out.print("</tr>");

        for (int i = 0; i < data.size(); i++) {
        
            out.print("<tr>");
            out.print("<form action ='hapusAkun'>");
            out.print("");
            out.print("<td><input type=\"text\" name='idAkun' value='" + data.get(i).getIdCustomer() + "' readonly></td>");
           
            out.print("<td>" + data.get(i).getNama()+ "</td>");
            out.print("<td>" + data.get(i).getUsername()+ "</td>");
            out.print("<td>" + data.get(i).getPassword()+ "</td>");
            out.print("<td>" + data.get(i).getAlamat()+ "</td>");
            out.print("<td><input type='submit' value='hapus'></td>");
            out.print("</form>");
            out.print("</tr>");

        }

        out.print("</table>");
        out.print("<br><a href=\"admin.jsp\">Kembali</a>");
        out.print("</center>");
        out.print("</body");
        out.print("</html>");
       

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
        processRequest(request, response);
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

    private List<CostumerID> showUser() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.rpl.WsRpl port = service.getWsRplPort();
        return port.showUser();
    }

    private java.util.List<org.rpl.Booking> showTransaksii() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.rpl.WsRpl port = service.getWsRplPort();
        return port.showTransaksii();
    }

}
