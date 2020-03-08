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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASUS
 */
public class halutLogin1 extends HttpServlet {

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
            out.println("<title>Servlet halutLogin1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet halutLogin1 at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        HttpSession ses = request.getSession();
        String nama = (String) ses.getAttribute("nama");

        out.println("<!halaman awal banget selamat datang>\n"
                + "\n"
                + "<!DOCTYPE HTML>\n"
                + "<html>\n"
                + "  <head>\n"
                + "    <meta charset=\"utf-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <title>Aria Room & Swimming Pool</title>\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
                + "    <meta name=\"description\" content=\"\" />\n"
                + "    <meta name=\"keywords\" content=\"\" />\n"
                + "    <meta name=\"author\" content=\"\" />\n"
                + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=|Roboto+Sans:400,700|Playfair+Display:400,700\">\n"
                + "\n"
                + "    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/animate.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/aos.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/fancybox.min.css\">\n"
                + "    \n"
                + "    <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\n"
                + "\n"
                + "    <!-- Theme Style -->\n"
                + "    <link rel=\"stylesheet\" href=\"css/style.css\">\n"
                + "  </head>\n"
                + "  <body>\n"
                + "    \n"
                + "    <header class=\"site-header js-site-header\">\n"
                + "      <div class=\"container-fluid\">\n"
                + "        <div class=\"row align-items-center\">\n"
                + "            <div class=\"col-6 col-lg-4 site-logo\" data-aos=\"fade\"><a href=\"halutLogin1.jsp\">Aria Room & Swimming Pool</a></div>\n"
                + "          <div class=\"col-6 col-lg-8\">\n"
                + "\n"
                + "\n"
                + "            <div class=\"site-menu-toggle js-site-menu-toggle\"  data-aos=\"fade\">\n"
                + "              <span></span>\n"
                + "              <span></span>\n"
                + "              <span></span>\n"
                + "            </div>\n"
                + "            <!-- END menu-toggle -->\n"
                + "\n"
                + "            <div class=\"site-navbar js-site-navbar\">\n"
                + "              <nav role=\"navigation\">\n"
                + "                <div class=\"container\">\n"
                + "                  <div class=\"row full-height align-items-center\">\n"
                + "                    <div class=\"col-md-6 mx-auto\">\n"
                + "                      <ul class=\"list-unstyled menu\">\n"
                + "                        <li class=\"active\"><a href=\"halutLogin1.jsp\">Halaman Utama</a></li>\n"
                + "                        <li><a href=\"kamar.html\">Kamar</a></li>\n"
                + "                        <li><a href=\"booking.jsp\">Booking</a></li>\n"
                + "                        <li><a href=\"pembayaran.html\">Pembayaran</a></li>\n"
                + "                        <li><a href=\"./logout\">Log Out</a></li>\n"
                + "                      </ul>\n"
                + "                    </div>\n"
                + "                  </div>\n"
                + "                </div>\n"
                + "              </nav>\n"
                + "            </div>\n"
                + "          </div>\n"
                + "        </div>\n"
                + "      </div>\n"
                + "    </header>\n"
                + "    <!-- END head -->\n"
                + "\n"
                + "    <section class=\"site-hero overlay\" style=\"background-image: url(images/hero_4.jpg)\" data-stellar-background-ratio=\"0.5\">\n"
                + "      <div class=\"container\">\n"
                + "        <div class=\"row site-hero-inner justify-content-center align-items-center\">\n"
                + "          <div class=\"col-md-10 text-center\" data-aos=\"fade-up\">\n"
                + "            <span class=\"custom-caption text-uppercase text-white d-block  mb-3\">Welcome To Aria Room & Swimming Pool </span>\n"
                + "            <h1 class=\"heading\">Selamat Datang</h1>\n"
                + "            <br><h1 class=\"heading\">" + nama.toUpperCase() + "</h1></br>"
                + "          </div>\n"
                + "        </div>\n"
                + "      </div>\n"
                + "\n"
                + "      <a class=\"mouse smoothscroll\" href=\"#next\">\n"
                + "        <div class=\"mouse-icon\">\n"
                + "          <span class=\"mouse-wheel\"></span>\n"
                + "        </div>\n"
                + "      </a>\n"
                + "    </section>\n"
                + "    <!-- END section -->\n"
                + "\n"
                + "    \n"
                + "\n"
                + "    <section class=\"py-5 bg-light\">\n"
                + "      <div class=\"container\">\n"
                + "        <div class=\"row align-items-center\">\n"
                + "          <div class=\"col-md-12 col-lg-7 ml-auto order-lg-2 position-relative mb-5\" data-aos=\"fade-up\">\n"
                + "            <figure class=\"img-absolute\">\n"
                + "              <img src=\"images/food-1.jpg\" alt=\"Image\" class=\"img-fluid\">\n"
                + "            </figure>\n"
                + "            <img src=\"images/img_1.jpg\" alt=\"Image\" class=\"img-fluid rounded\">\n"
                + "          </div>\n"
                + "          <div class=\"col-md-12 col-lg-4 order-lg-1\" data-aos=\"fade-up\">\n"
                + "            <h2 class=\"heading\">Welcome!</h2>\n"
                + "            <p class=\"mb-4\">Hunian dan tempat berlibur yang sangat nyaman. Terletak di pinggiran kota Yogyakarta, bebas dari kebisingan kota dan mudah dijangkau dari berbagai titik di Yogyakarta.</p>\n"
                + "            <p><a href=\"#\" class=\"btn btn-primary text-white py-2 mr-3\">Learn More</a> <span class=\"mr-3 font-family-serif\"><em>or</em></span> <a href=\"https://vimeo.com/channels/staffpicks/93951774\"  data-fancybox class=\"text-uppercase letter-spacing-1\">See video</a></p>\n"
                + "          </div>\n"
                + "          \n"
                + "        </div>\n"
                + "      </div>\n"
                + "    </section>\n"
                + "\n"
                + "    <section class=\"section\">\n"
                + "      <div class=\"container\">\n"
                + "        <div class=\"row justify-content-center text-center mb-5\">\n"
                + "          <div class=\"col-md-7\">\n"
                + "            <h2 class=\"heading\" data-aos=\"fade-up\">Rooms &amp; Suites</h2>\n"
                + "            <p data-aos=\"fade-up\" data-aos-delay=\"100\">dengan konsep kamar yang berbeda, terbuat dari kayu sehingga memiliki sensasi berbeda dan kelasik</p>\n"
                + "          </div>\n"
                + "        </div>\n"
                + "        <div class=\"row\">\n"
                + "          <div class=\"col-md-6 col-lg-4\" data-aos=\"fade-up\">\n"
                + "            <a href=\"booking.jsp\" class=\"room\">\n"
                + "              <figure class=\"img-wrap\">\n"
                + "                <img src=\"images/img_1.jpg\" alt=\"Free website template\" class=\"img-fluid mb-3\">\n"
                + "              </figure>\n"
                + "              <div class=\"p-3 text-center room-info\">\n"
                + "                <h2>Single Room</h2>\n"
                + "                <span class=\"text-uppercase letter-spacing-1\"> 250k / Malam</span>\n"
                + "              </div>\n"
                + "            </a>\n"
                + "          </div>\n"
                + "\n"
                + "          <div class=\"col-md-6 col-lg-4\" data-aos=\"fade-up\">\n"
                + "            <a href=\"booking.jsp\" class=\"room\">\n"
                + "              <figure class=\"img-wrap\">\n"
                + "                <img src=\"images/img_2.jpg\" alt=\"Free website template\" class=\"img-fluid mb-3\">\n"
                + "              </figure>\n"
                + "              <div class=\"p-3 text-center room-info\">\n"
                + "                <h2>Family Room</h2>\n"
                + "                <span class=\"text-uppercase letter-spacing-1\">350k / Malam</span>\n"
                + "              </div>\n"
                + "            </a>\n"
                + "          </div>\n"
                + "\n"
                + "          <div class=\"col-md-6 col-lg-4\" data-aos=\"fade-up\">\n"
                + "            <a href=\"booking.jsp\" class=\"room\">\n"
                + "              <figure class=\"img-wrap\">\n"
                + "                <img src=\"images/img_3.jpg\" alt=\"Free website template\" class=\"img-fluid mb-3\">\n"
                + "              </figure>\n"
                + "              <div class=\"p-3 text-center room-info\">\n"
                + "                <h2>Presidential Room</h2>\n"
                + "                <span class=\"text-uppercase letter-spacing-1\">500k / Malam</span>\n"
                + "              </div>\n"
                + "            </a>\n"
                + "          </div>\n"
                + "\n"
                + "\n"
                + "        </div>\n"
                + "      </div>\n"
                + "    </section>\n"
                + "    \n"
                + "    \n"
                + "    <section class=\"section slider-section bg-light\">\n"
                + "      <div class=\"container\">\n"
                + "        <div class=\"row justify-content-center text-center mb-5\">\n"
                + "          <div class=\"col-md-7\">\n"
                + "            <h2 class=\"heading\" data-aos=\"fade-up\">Photos</h2>\n"
                + "          </div>\n"
                + "        </div>\n"
                + "        <div class=\"row\">\n"
                + "          <div class=\"col-md-12\">\n"
                + "            <div class=\"home-slider major-caousel owl-carousel mb-5\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n"
                + "              <div class=\"slider-item\">\n"
                + "                <a href=\"images/lengkap.jpg\" data-fancybox=\"images\" data-caption=\"Caption for this image\"><img src=\"images/slider-1.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"></a>\n"
                + "              </div>\n"
                + "              <div class=\"slider-item\">\n"
                + "                <a href=\"images/living-room.jpg\" data-fancybox=\"images\" data-caption=\"Caption for this image\"><img src=\"images/slider-2.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"></a>\n"
                + "              </div>\n"
                + "              <div class=\"slider-item\">\n"
                + "                <a href=\"images/kamar.jpg\" data-fancybox=\"images\" data-caption=\"Caption for this image\"><img src=\"images/slider-3.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"></a>\n"
                + "              </div>\n"
                + "              <div class=\"slider-item\">\n"
                + "                <a href=\"images/dapur.jpg\" data-fancybox=\"images\" data-caption=\"Caption for this image\"><img src=\"images/slider-4.jpg\" alt=\"Image placeholder\" class=\"img-fluid\"></a>\n"
                + "              </div>\n"
                + "            </div>\n"
                + "            <!-- END slider -->\n"
                + "          </div>\n"
                + "        \n"
                + "        </div>\n"
                + "      </div>\n"
                + "    </section>\n"
                + "    <!-- END section -->\n"
                + "\n"
                + "    <section class=\"section bg-image overlay\" style=\"background-image: url('images/hero_4.jpg');\">\n"
                + "        <div class=\"container\" >\n"
                + "          <div class=\"row align-items-center\">\n"
                + "            <div class=\"col-12 col-md-6 text-center mb-4 mb-md-0 text-md-left\" data-aos=\"fade-up\">\n"
                + "              <h2 class=\"text-white font-weight-bold\">A Best Place To Stay. Reserve Now!</h2>\n"
                + "            </div>\n"
                + "            <div class=\"col-12 col-md-6 text-center text-md-right\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n"
                + "              <a href=\"booking.jsp\" class=\"btn btn-outline-white-primary py-3 text-white px-5\">Reserve Now</a>\n"
                + "            </div>\n"
                + "          </div>\n"
                + "        </div>\n"
                + "      </section>\n"
                + "\n"
                + "    <footer class=\"section footer-section\">\n"
                + "      <div class=\"container\">\n"
                + "        <div class=\"row mb-4\">\n"
                + "          <div class=\"col-md-3 mb-5\">\n"
                + "            <ul class=\"list-unstyled link\">\n"
                + "              <li><a href=\"kamar.html\">Rooms</a></li>\n"
                + "            </ul>\n"
                + "          </div>\n"
                + "          <div class=\"col-md-3 mb-5\">\n"
                + "            <ul class=\"list-unstyled link\">\n"
                + "                <li><a href=\"kamar.html\">The Rooms &amp; Suites</a></li>\n"
                + "            </ul>\n"
                + "          </div>\n"
                + "          <div class=\"col-md-3 mb-5 pr-md-5 contact-info\">\n"
                + "            <!-- <li>198 West 21th Street, <br> Suite 721 New York NY 10016</li> -->\n"
                + "            <p><span class=\"d-block\"><span class=\"ion-ios-location h5 mr-3 text-primary\"></span>Address:</span> <span> jalan stadion no 331 Tajem Maguwoharjo Yogyakarta <br> Jalan Tukad Badung no 331 Denpasar Bali</span></p>\n"
                + "            <p><span class=\"d-block\"><span class=\"ion-ios-telephone h5 mr-3 text-primary\"></span>Phone:</span> <span> 08123456789 </span></p>\n"
                + "            <p><span class=\"d-block\"><span class=\"ion-ios-email h5 mr-3 text-primary\"></span>Email:</span> <span> Ariarooms@gmail.com</span></p>\n"
                + "          </div>\n"
                + "          <div class=\"col-md-3 mb-5\">\n"
                + "            <p>Sign up for our newsletter</p>\n"
                + "            <form action=\"#\" class=\"footer-newsletter\">\n"
                + "              <div class=\"form-group\">\n"
                + "                <input type=\"email\" class=\"form-control\" placeholder=\"Email...\">\n"
                + "                <button type=\"submit\" class=\"btn\"><span class=\"fa fa-paper-plane\"></span></button>\n"
                + "              </div>\n"
                + "            </form>\n"
                + "          </div>\n"
                + "        </div>\n"
                + "        <div class=\"row pt-5\">\n"
                + "          <p class=\"col-md-6 text-left\">\n"
                + " \n"
                + "          </p>\n"
                + "            \n"
                + "          <p class=\"col-md-6 text-right social\">\n"
                + "            <a href=\"#\"><span class=\"fa fa-tripadvisor\"></span></a>\n"
                + "            <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n"
                + "            <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n"
                + "            <a href=\"#\"><span class=\"fa fa-linkedin\"></span></a>\n"
                + "            <a href=\"#\"><span class=\"fa fa-vimeo\"></span></a>\n"
                + "          </p>\n"
                + "        </div>\n"
                + "      </div>\n"
                + "    </footer>\n"
                + "    \n"
                + "    <script src=\"js/jquery-3.3.1.min.js\"></script>\n"
                + "    <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n"
                + "    <script src=\"js/popper.min.js\"></script>\n"
                + "    <script src=\"js/bootstrap.min.js\"></script>\n"
                + "    <script src=\"js/owl.carousel.min.js\"></script>\n"
                + "    <script src=\"js/jquery.stellar.min.js\"></script>\n"
                + "    <script src=\"js/jquery.fancybox.min.js\"></script>\n"
                + "    \n"
                + "    \n"
                + "    <script src=\"js/aos.js\"></script>\n"
                + "    \n"
                + "    <script src=\"js/bootstrap-datepicker.js\"></script> \n"
                + "    <script src=\"js/jquery.timepicker.min.js\"></script> \n"
                + "\n"
                + "    \n"
                + "\n"
                + "    <script src=\"js/main.js\"></script>\n"
                + "  </body>\n"
                + "</html>");

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
