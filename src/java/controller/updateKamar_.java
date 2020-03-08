/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Fungsi.DataBaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROG
 */
public class updateKamar_ extends HttpServlet {

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
            out.println("<title>Servlet updateKamar_</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateKamar_ at " + request.getContextPath() + "</h1>");
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
        try {
            response.setContentType("text/html");
            DataBaseConnection connect = new DataBaseConnection();
            DataBaseConnection conn = new DataBaseConnection();
            PrintWriter out = response.getWriter();
            
            String kamarId = request.getParameter("idKamar");
            String tipeKamar = request.getParameter("tipeKamar");
            String hargaKamar = request.getParameter("hargaKamar");
            String jumlahKamar = request.getParameter("jumlahKamar");
            
            System.out.println(kamarId);
            
            String querykamar = "select * from kamar where idKamar LIKE "+kamarId;
             Statement statement = conn.getConnection().createStatement();
            ResultSet result = statement.executeQuery(querykamar);
            if (result.next()) {
                kamarId = result.getString(1);
                tipeKamar = result.getString(2);
                hargaKamar = result.getString(3);
                jumlahKamar = result.getString(4);
                response.sendRedirect("updateKamar.jsp?idKamar='" +kamarId+ "'&tipeKamar='" +tipeKamar+ "'&hargaKamar='" +hargaKamar+ "'&jumlahKamar='" +jumlahKamar+ "'");
                
            }   
        } catch (SQLException ex) {
            Logger.getLogger(updateKamar_.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
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

}
