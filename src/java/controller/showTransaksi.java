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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.rpl.WsRpl_Service;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "showTransaksi", urlPatterns = {"/showTransaksi"})
public class showTransaksi extends HttpServlet {
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
            out.println("<title>Servlet showTransaksi</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet showTransaksi at " + request.getContextPath() + "</h1>");
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
         System.out.println("ad");
        response.setContentType("text/html");
       
        java.util.List<org.rpl.Booking> data = showTransaksii();
        
        PrintWriter out = response.getWriter();
       
            out.print("<html>");
            out.print("<body>");
            out.print("<center> <h1> TRANSAKSI ARIA ROOM AND SWIMMING POOL </h1> <table border=3>");
            out.print("<tr>");
            out.print("<td>ID Booking</td>"
                    + "<td>ID Customer</td>");
            out.print("<td>Nama</td>");
            out.print("<td>Telepon</td>");
            out.print("<td>Tanggal Masuk</td>");
            out.print("<td>Tanggal Keluar</td>");
            out.print("<td>Jumlah Tamu</td>");
            out.print("<td>Nomor Virtual Account</td>");
            out.print("<td>Cabang</td>");
            out.print("<td>Tipe Kamar</td>");
            out.print("</tr>");
           for (int i = 0; i < data.size(); i++) {
            
  
                out.print("<tr>");
                out.print("<td>" + data.get(i).getIdBooking()+ "</td>");
                out.print("<td>" + data.get(i).getIdCustomer()+ "</td>");
                out.print("<td>" + data.get(i).getNama()+ "</td>");
                out.print("<td>" + data.get(i).getTelepon()+ "</td>");
                out.print("<td>" + data.get(i).getTanggalMasuk()+ "</td>");
                out.print("<td>" + data.get(i).getTanggalKeluar()+ "</td>");
                out.print("<td>" + data.get(i).getJumlahTamu()+ "</td>");
                out.print("<td>" + data.get(i).getVirtualAcc()+ "</td>");
                out.print("<td>" + data.get(i).getCabang()+ "</td>");
                out.print("<td>" + data.get(i).getTipeKamar()+ "</td>");
                out.print("<td><a href=hapusBooking?idBooking='"+data.get(i).getIdBooking()+"'>Hapus</td>");
                out.print("</tr>");

            }
            out.print("</table><br>");
            out.print("<a href = 'admin.jsp'>Kembali</center>");
         //   out.print("<a href = 'tambahKamar.java'>Tambah Kamar");
            out.print("</body>");
            out.print("</html>");
       

    }
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

    private java.util.List<org.rpl.Booking> showTransaksii() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.rpl.WsRpl port = service.getWsRplPort();
        return port.showTransaksii();
    }

  
    

   

    

}
