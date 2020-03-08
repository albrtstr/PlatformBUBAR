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
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ROG
 */
public class admin extends HttpServlet {

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
            out.println("<title>Servlet admin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet admin at " + request.getContextPath() + "</h1>");
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
        response.setContentType("test/html");
        DataBaseConnection conn = new DataBaseConnection();
        Connection connect = conn.getConnection();
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>\n"
                + "<!--halaman admin\n"
                + "To change this license header, choose License Headers in Project Properties.\n"
                + "To change this template file, choose Tools | Templates\n"
                + "and open the template in the editor.\n"
                + "-->\n"
                + "<html>\n"
                + "    <head>\n"
                + "\n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
                + "        <meta name=\"description\" content=\"\" />\n"
                + "        <meta name=\"keywords\" content=\"\" />\n"
                + "        <meta name=\"author\" content=\"\" />\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=|Roboto+Sans:400,700|Playfair+Display:400,700\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/animate.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/aos.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/fancybox.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\n"
                + "\n"
                + "        <!-- Theme Style -->\n"
                + "        <link rel=\"stylesheet\" href=\"css/style.css\">\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <header class=\"site-header js-site-header\">\n"
                + "            <div class=\"container-fluid\">\n"
                + "                <div class=\"row align-items-center\">\n"
                + "                    <div class=\"col-6 col-lg-4 site-logo\" data-aos=\"fade\">Aria Room and Swimming Pool</div>\n"
                + "                    <!-- END menu-toggle -->\n"
                + "\n"
                + "                    <div class=\"site-navbar js-site-navbar\">\n"
                + "                        <nav role=\"navigation\">\n"
                + "                            <div class=\"container\">\n"
                + "                                <div class=\"row full-height align-items-center\">\n"
                + "                                    <div class=\"col-md-6 mx-auto\">\n"
                + "                                        <ul class=\"list-unstyled menu\">\n"
                + "                                        </ul>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                        </nav>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "\n"
                + "        </header>\n"
                + "        <!-- END head -->\n"
                + "\n"
                + "        <section class=\"site-hero overlay\" style=\"background-image: url(images/hero_4.jpg)\" data-stellar-background-ratio=\"0.5\">\n"
                + "            <div class=\"container\">\n"
                + "                <div class=\"row site-hero-inner justify-content-center align-items-center\">\n"
                + "                    <div class=\"col-md-10 text-center\" data-aos=\"fade-up\">\n"
                + "                        <h1 class=\"heading\">SELAMAT DATANG DI ARIA ROOMS AND SWIMMING POOL</h1>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "\n"
                + "\n"
                + "        </section>\n"
                + "        <!-- END section -->\n"
                + "\n"
                + "        <section class=\"section bg-light pb-0\"  >\n"
                + "            <div class=\"container\">\n"
                + "\n"
                + "                <div class=\"row check-availabilty\" id=\"next\">\n"
                + "                    <div class=\"block-32\" data-aos=\"fade-up\" data-aos-offset=\"-200\">\n"
                + "                        <form action=\"#\" method=\"GET\">\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 col-lg-3 align-self-end\">\n"
                + "                                    <a class=\"button\" href=\"showKamar\">Kelola kamar</a>\n"
                + "                                    \n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 col-lg-3 align-self-end\">\n"
                + "                                     <a class=\"button\" href=\"showUser\">Kelola Akun</a>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 col-lg-3 align-self-end\">\n"
                + "                                     <a class=\"button\" href=\"transaksi\">Transaksi</a>\n"
                + "                                </div>                                \n"
                + "                            </div>\n"
                + "                        </form>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </section>\n"
                + "        <script src=\"js/jquery-3.3.1.min.js\"></script>\n"
                + "        <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n"
                + "        <script src=\"js/popper.min.js\"></script>\n"
                + "        <script src=\"js/bootstrap.min.js\"></script>\n"
                + "        <script src=\"js/owl.carousel.min.js\"></script>\n"
                + "        <script src=\"js/jquery.stellar.min.js\"></script>\n"
                + "        <script src=\"js/jquery.fancybox.min.js\"></script>\n"
                + "        <script src=\"js/aos.js\"></script>\n"
                + "        <script src=\"js/bootstrap-datepicker.js\"></script> \n"
                + "        <script src=\"js/jquery.timepicker.min.js\"></script> \n"
                + "        <script src=\"js/main.js\"></script>\n"
                + "    </body>\n"
                + "</html>\n"
                + " ");
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
