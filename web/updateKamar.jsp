<%-- 
    Document   : updateKamar
    Created on : Dec 16, 2019, 5:57:58 PM
    Author     : ROG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            function notifDaftar() {
                var id_kamar = document.forms["tambahKamar"]["idKamar"].value;
                var tipe_kamar = document.forms["tambahKamar"]["tipeKamar"].value;
                var harga_kamar = document.forms["tambahKamar"]["hargaKamar"].value;


                if ((id_kamar && tipe_kamar && harga_kamar) === "") {
                    alert("Data belum diisi dengan lengkap!");
                    return false;
                }
                if ((id_kamar && tipe_kamar && harga_kamar) !== null) {
                    alert("Kamar berhasil ditambahkan!");
                }
            }
        </script>

        <% String idKamar = request.getParameter("idKamar");%>
        <% String tipeKamar = request.getParameter("tipeKamar");%>
        <% String hargaKamar = request.getParameter("hargaKamar");%>
        <% String jumlahKamar = request.getParameter("jumlahKamar");%>
        
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Aria Rooms and Swimming Pool</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <meta name="author" content="" />
        <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=|Roboto+Sans:400,700|Playfair+Display:400,700">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/aos.css">
        <link rel="stylesheet" href="css/bootstrap-datepicker.css">
        <link rel="stylesheet" href="css/jquery.timepicker.css">
        <link rel="stylesheet" href="css/fancybox.min.css">

        <link rel="stylesheet" href="fonts/ionicons/css/ionicons.min.css">
        <link rel="stylesheet" href="fonts/fontawesome/css/font-awesome.min.css">

        <!-- Theme Style -->
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>

        <header class="site-header js-site-header">
            <div class="container-fluid">
                <div class="row align-items-center">
                    <div class="col-6 col-lg-4 site-logo" data-aos="fade"><a href="index.html">Aria Rooms & Swimming Pool</a></div>
                    <div class="col-6 col-lg-8">


                        <div class="site-menu-toggle js-site-menu-toggle"  data-aos="fade">
                            <span></span>
                            <span></span>
                            <span></span>
                        </div>
                        <!-- END menu-toggle -->
                    </div>
                </div>
            </div>
        </header>
        <!-- END head -->

        <section class="site-hero inner-page overlay" style="background-image: url(images/hero_4.jpg)" data-stellar-background-ratio="0.5">
            <div class="container">
                <div class="row site-hero-inner justify-content-center align-items-center">
                    <div class="col-md-10 text-center" data-aos="fade">
                        <h1 class="heading mb-3">UPDATE DATA KAMAR</h1>
                        <ul class="custom-breadcrumbs mb-4">
                        </ul>
                    </div>
                </div>
            </div>

            <a class="mouse smoothscroll" href="#next">
                <div class="mouse-icon">
                    <span class="mouse-wheel"></span>
                </div>
            </a>
        </section>
        <!-- END section -->

        <section class="section contact-section" id="next">
            <div class="container">
                <div class="row">
                    <div class="col-md-7" data-aos="fade-up" data-aos-delay="100">
                        <form name="updateKamar" method="GET" action="fungsiUpdateKamar" class="bg-white p-md-5 p-4 mb-5 border">
                            <div class="row">
                                <div class="col-md-6 form-group">
                                    <label class="text-black font-weight-bold" for="id">ID KAMAR</label>
                                    <input type="text" id="id" name="idKamar" class="form-control" value=<%=idKamar%>>
                                </div>
                                <div class="col-md-6 form-group">
                                    <label class="text-black font-weight-bold" for="tipe">TIPE KAMAR</label>
                                    <input type="text" id="tipe" name="tipeKamar" class="form-control" value=<%=tipeKamar%>>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6 form-group">
                                    <label class="text-black font-weight-bold" for="harga">HARGA KAMAR</label>
                                    <input type="text" id="harga" name="hargaKamar" class="form-control" value=<%=hargaKamar%>>
                                </div>
                                <div class="col-md-6 form-group">
                                    <label class="text-black font-weight-bold" for="harga">JUMLAH KAMAR</label>
                                    <input type="text" id="jumlah" name="jumlahKamar" class="form-control" value=<%=jumlahKamar%>>
                                </div>

                            </div>


                            <div class="row">
                                <div class="col-md-6 form-group">
                                    <button type="submit" value="Update" class="btn btn-primary text-white py-3 px-5 font-weight-bold">Update</button>
                                </div>
                            </div>
                        </form> 
                    </div>
                    <div class="col-md-5" data-aos="fade-up" data-aos-delay="200">
                        <div class="row">
                            <div class="col-md-10 ml-auto contact-info">
                                <p><span class="d-block">Alamat:</span> <span class="text-black"> Jalan Stadion Nomor 331, Tajem, Maguwoharjo, Depok, Sleman, Yogyakarta</span></p>
                                <p><span class="d-block">Phone:</span> <span class="text-black"> (0274) 433 2059</span></p>
                                <p><span class="d-block">Email:</span> <span class="text-black"> ariarooms@gmail.com</span></p>
                            </div>
                        </div>
                    </div>
                </div>
        </section>



        <section class="section bg-image overlay" style="background-image: url('images/hero_4.jpg');">
            <div class="container" >
                <div class="row align-items-center">
                    <div class="col-12 col-md-6 text-center mb-4 mb-md-0 text-md-left" data-aos="fade-up">
                        <h2 class="text-white font-weight-bold">A Best Place To Stay. Reserve Now!</h2>
                    </div>
                    <div class="col-12 col-md-6 text-center text-md-right" data-aos="fade-up" data-aos-delay="200">
                        <a href="reservation.html" class="btn btn-outline-white-primary py-3 text-white px-5">Reserve Now</a>
                    </div>
                </div>
            </div>
        </section>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/jquery-migrate-3.0.1.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.stellar.min.js"></script>
        <script src="js/jquery.fancybox.min.js"></script>
        <script src="js/aos.js"></script>
        <script src="js/bootstrap-datepicker.js"></script> 
        <script src="js/jquery.timepicker.min.js"></script> 
        <script src="js/main.js"></script>
    </body>
</html>
