/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Fungsi.function;
import Tools.booking;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class Booking extends HttpServlet {

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
            out.println("<title>Servlet Booking</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Booking at " + request.getContextPath() + "</h1>");
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
        String nama = request.getParameter("namaCust");
        String phone = request.getParameter("teleponCust");
        String email = request.getParameter("emailCust");
        String checkinCust = request.getParameter("checkinCust");
        String checkoutCust = request.getParameter("checkoutCust");
        String jumlahTamu = request.getParameter("jumlahTamu");
        String Cabang = request.getParameter("Cabang");
        String JenisKamar = request.getParameter("JenisKamar");
        String catatanCust = request.getParameter("catatanCust");
        String[] a = checkinCust.split(" ");
        String[] b = checkoutCust.split(" ");
        int durasi =Math.abs(Integer.parseInt(a[0])- Integer.parseInt(b[0]));
        int harga = 0;
        int Total = 0;

        if (JenisKamar.equalsIgnoreCase("Single Room")) {
            harga = 500000;
            Total = harga * durasi;
        }
        else if (JenisKamar.equalsIgnoreCase("Family Room")){
            harga = 750000;
            Total= harga * durasi;
        }
        else if (JenisKamar.equalsIgnoreCase("Presidential Room")){
            harga = 1000000;
            Total = harga * durasi;
        }
        System.out.println(a[0] + b[0] +durasi);
        String rincian = "Harga kamar : Rp." + Integer.toString(harga) + "\n"
                + "Durasi Menginap : "+Integer.toString(durasi) + " Hari" +"\n"
                +"Jumlah Tamu : "+ jumlahTamu + "\n";
        String hargaTotal = "Rp." + Integer.toString(Total);
        int max = 999;
        int min = 100;
        int idBookingRand = (int) (Math.random() * ((max - min) + 1)) + min;
        int idCustomerRand = (int) (Math.random() * ((max - min) + 1)) + min;
        int idKamarRand = (int) (Math.random() * ((max - min) + 1)) + min;
        int virAccRand = (int) (Math.random() * ((max - min) + 1)) + min;
        
        out.print("<!DOCTYPE HTML>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta charset=\"utf-8\">\n"
                + "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "        <title>Aria Rooms and Swimming Pool</title>\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
                + "        <meta name=\"description\" content=\"\" />\n"
                + "        <meta name=\"keywords\" content=\"\" />\n"
                + "        <meta name=\"author\" content=\"\" />\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=|Roboto+Sans:400,700|Playfair+Display:400,700\">\n"
                + "\n"
                + "        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/animate.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/aos.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/fancybox.min.css\">\n"
                + "\n"
                + "        <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\n"
                + "\n"
                + "        <!-- Theme Style -->\n"
                + "        <link rel=\"stylesheet\" href=\"css/style.css\">\n"
                + "    </head>\n"
                + "    <script>\n"
                + "        function buttonReserve(){\n"
                + "            var test;\n"
                + "            if(confirm(\"Apakah anda yakin?\")){\n"
                + "                alert(\"Data berhasil disimpan!\");"
                + "                return true;\n"
                + "            } else {\n"
                + "                return false;\n"
                + "            }\n"
                + "        }\n"
                + "    </script>"
                + "    <body>\n"
                + "\n"
                + "        <header class=\"site-header js-site-header\">\n"
                + "            <div class=\"container-fluid\">\n"
                + "                <div class=\"row align-items-center\">\n"
                + "                    <div class=\"col-6 col-lg-4 site-logo\" data-aos=\"fade\">Aria Rooms & Swimming Pool</div>\n"
                + "                    <div class=\"col-6 col-lg-8\">\n"
                + "\n"
                + "\n"
                + "                        <div class=\"site-menu-toggle js-site-menu-toggle\"  data-aos=\"fade\">\n"
                + "                            <span></span>\n"
                + "                            <span></span>\n"
                + "                            <span></span>\n"
                + "                        </div>\n"
                + "                        <!-- END menu-toggle -->\n"
                + "\n"
                + "                        <div class=\"site-navbar js-site-navbar\">\n"
                + "                            <nav role=\"navigation\">\n"
                + "                                <div class=\"container\">\n"
                + "                                    <div class=\"row full-height align-items-center\">\n"
                + "                                        <div class=\"col-md-6 mx-auto\">\n"
                + "                                            <ul class=\"list-unstyled menu\">\n"
                + "                                                <li><a href=\"halut.html\">Halaman Utama</a></li>\n"
                + "                                                <li><a href=\"kamar.html\">Kamar</a></li>                      \n"
                + "                                                <li><a href=\"booking.jsp\">Booking</a></li>\n"
                + "                                                <li class=\"active\"><a href=\"pembayaran.html\">Pembayaran</a></li>\n"
                + "                                                <li><a href=\"./logout\">Logout</a></li>\n"
                + "                                            </ul>\n"
                + "                                        </div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </nav>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </header>\n"
                + "        <!-- END head -->\n"
                + "\n"
                + "        <section class=\"site-hero inner-page overlay\" style=\"background-image: url(images/hero_4.jpg)\" data-stellar-background-ratio=\"0.5\">\n"
                + "            <div class=\"container\">\n"
                + "                <div class=\"row site-hero-inner justify-content-center align-items-center\">\n"
                + "                    <div class=\"col-md-10 text-center\" data-aos=\"fade\">\n"
                + "                        <h1 class=\"heading mb-3\">REVIEW BOOKING</h1>\n"
                + "                        <ul class=\"custom-breadcrumbs mb-4\">\n"
                + "                        </ul>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "\n"
                + "            <a class=\"mouse smoothscroll\" href=\"#next\">\n"
                + "                <div class=\"mouse-icon\">\n"
                + "                    <span class=\"mouse-wheel\"></span>\n"
                + "                </div>\n"
                + "            </a>\n"
                + "        </section>\n"
                + "        <!-- END section -->\n"
                + "\n"
                + "        <section class=\"section contact-section\" id=\"next\">\n"
                + "            <div class=\"container\">\n"
                + "                <div class=\"row\">\n"
                + "                    <div class=\"col-md-7\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n"
                + "\n"
                + "                        <form action=\"Pembayaran\" method=\"POST\" class=\"bg-white p-md-5 p-4 mb-5 border\">\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"name\">Nama</label>\n"
                + "                                    <input type=\"text\" id=\"name\" name=\"namaCust\" class=\"form-control \" value=\"" + nama + "\" readonly>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"phone\">Telepon</label>\n"
                + "                                    <input type=\"text\" id=\"phone\" name=\"teleponCust\" class=\"form-control \" value=\"" + phone + "\" readonly >\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-12 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"email\">Email</label>\n"
                + "                                    <input type=\"email\" id=\"email\" name=\"emailCust\" class=\"form-control \" value=\"" + email + "\" readonly>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"checkin_date\">Check In</label>\n"
                + "                                    <input type=\"text\"  name=\"checkinCust\" class=\"form-control\" value=\"" + checkinCust + "\" readonly>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"checkout_date\">Check Out</label>\n"
                + "                                    <input type=\"text\"  name=\"checkoutCust\" class=\"form-control\" value=\"" + checkoutCust + "\" readonly>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label for=\"adults\" class=\"font-weight-bold text-black\">Jumlah Tamu</label>\n"
                + "                                    <input type=\"text\" id=\"Tamu\" name=\"jumlahTamu\" class=\"form-control\" value=\'" + jumlahTamu + "\' readonly>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label for=\"Cabang\" class=\"font-weight-bold text-black\">Cabang</label>\n"
                + "                                    <input type=\"text\" id=\"Cabang\" name=\"Cabang\" class=\"form-control\" value=\'" + Cabang + "\' readonly>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-12 form-group\">\n"
                + "                                    <label for=\"adults\" class=\"font-weight-bold text-black\">Jenis Kamar</label>\n"
                + "                                    <input type=\"text\" id=\"Kamar\" name=\"JenisKamar\" class=\"form-control\" value=\'" + JenisKamar + "\' readonly>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <div class=\"row mb-4\">\n"
                + "                                <div class=\"col-md-12 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"message\">Catatan</label>\n"
                + "                                    <textarea name=\"catatanCust\" id=\"message\" class=\"form-control \" cols=\"30\" rows=\"8\" readonly>" + catatanCust + "</textarea>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-12 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"message\">Rincian Biaya</label>\n"
                + "                                    <textarea name=\"rincianCust\" id=\"message\" class=\"form-control \" cols=\"30\" rows=\"8\" readonly>" + rincian + "</textarea>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-12 form-group\">\n"
                + "                                    <label for=\"adults\" class=\"font-weight-bold text-black\">Total Harga</label>\n"
                + "                                    <input type=\"text\" id=\"hargaTotal\" name=\"hargaTotal\" class=\"form-control\" value=\'" + hargaTotal + "\' readonly>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <button onclick=\"return buttonReserve()\" formaction=\"Pembayaran\" type=\"submit\" value=\"Reserve Now\" class=\"btn btn-primary text-white py-3 px-5 font-weight-bold\">Reserve Now</button>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <button formaction=\"booking.jsp\" type=\"submit\" value=\"Ubah\" class=\"btn btn-primary text-white py-3 px-5 font-weight-bold\">Ubah</button>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                        </form>\n"
                + "\n"
                + "                    </div>\n"
                + "                    <div class=\"col-md-5\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n"
                + "                        <div class=\"row\">\n"
                + "                            <div class=\"col-md-10 ml-auto contact-info\">\n"
                + "                                <p><span class=\"d-block\">Alamat:</span> <span class=\"text-black\"> Jalan Stadion Nomor 331, Tajem, Maguwoharjo, Depok, Sleman, Yogyakarta</span></p>\n"
                + "                                <p><span class=\"d-block\">Nomor Telepon:</span> <span class=\"text-black\"> (0274) 433 2059</span></p>\n"
                + "                                <p><span class=\"d-block\">Email:</span> <span class=\"text-black\"> ariarooms@gmail.com</span></p>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </section>\n"
                + "\n"
                + "        <section class=\"section bg-image overlay\" style=\"background-image: url('images/hero_4.jpg');\">\n"
                + "            <div class=\"container\" >\n"
                + "                <div class=\"row align-items-center\">\n"
                + "                    <div class=\"col-12 col-md-6 text-center mb-4 mb-md-0 text-md-left\" data-aos=\"fade-up\">\n"
                + "                        <h2 class=\"text-white font-weight-bold\">A Best Place To Stay. Reserve Now!</h2>\n"
                + "                    </div>\n"
                + "                    <div class=\"col-12 col-md-6 text-center text-md-right\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n"
                + "                        <a href=\"reservation.html\" class=\"btn btn-outline-white-primary py-3 text-white px-5\">Reserve Now</a>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </section>\n"
                + "\n"
                + "\n"
                + "        <script src=\"js/jquery-3.3.1.min.js\"></script>\n"
                + "        <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n"
                + "        <script src=\"js/popper.min.js\"></script>\n"
                + "        <script src=\"js/bootstrap.min.js\"></script>\n"
                + "        <script src=\"js/owl.carousel.min.js\"></script>\n"
                + "        <script src=\"js/jquery.stellar.min.js\"></script>\n"
                + "        <script src=\"js/jquery.fancybox.min.js\"></script>\n"
                + "\n"
                + "\n"
                + "        <script src=\"js/aos.js\"></script>\n"
                + "\n"
                + "        <script src=\"js/bootstrap-datepicker.js\"></script> \n"
                + "        <script src=\"js/jquery.timepicker.min.js\"></script> \n"
                + "\n"
                + "\n"
                + "\n"
                + "        <script src=\"js/main.js\"></script>\n"
                + "    </body>\n"
                + "</html>");

        
        
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
