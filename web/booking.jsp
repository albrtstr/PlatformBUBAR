<!halaman booking>
<!DOCTYPE HTML>
<html>
    <head>
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



    <script>
        function notifReserve() {
            var namaCust_ = document.forms["bookingForm"]["namaCust"].value;
            var teleponCust_ = document.forms["bookingForm"]["teleponCust"].value;
            var emailCust_ = document.forms["bookingForm"]["emailCust"].value;
            var checkinCust_ = document.forms["bookingForm"]["checkinCust"].value;
            var checkoutCust_ = document.forms["bookingForm"]["checkoutCust"].value;
            var jumlahTamu_ = document.forms["bookingForm"]["jumlahTamu"].value;
            var Cabang_ = document.forms["bookingForm"]["Cabang"].value;
            var JenisKamar_ = document.forms["bookingForm"]["JenisKamar"].value;

            if ((namaCust_ && teleponCust_ && emailCust_ && checkinCust_ && checkoutCust_ && jumlahTamu_ && Cabang_ && JenisKamar_) === "") {
                alert("Detail Pemesanan belum diisi lengkap!");
                return false;
            }
            if ((namaCust_ && teleponCust_ && emailCust_ && checkinCust_ && checkoutCust_ && jumlahTamu_ && Cabang_ && JenisKamar_) !== null) {
                return true;
            }

        }

        function jmlKamar() {

        <% Tools.kamar kam = new Tools.kamar(); %>
        <% Fungsi.function func = new Fungsi.function(); %>
        <% kam.setTipeKamar(request.getParameter("JenisKamar")); %>
        <% func.cekJumlahKamar(request.getParameter("JenisKamar")); %>

        }

        function ifJm() {
            var jKamar = document.forms["bookingForm"]["JenisKamar"].value;

            if (jKamar === "Single Room") {
        <% Fungsi.function func1 = new Fungsi.function(); %>
        <% kam.setTipeKamar(request.getParameter("JenisKamar")); %>
        <% func.cekJumlahKamar(request.getParameter("JenisKamar"));%>
            }
        }
        
        function cekKamar(){
            
        }
        


    </script>
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
                        <div class="site-navbar js-site-navbar">
                            <nav role="navigation">
                                <div class="container">
                                    <div class="row full-height align-items-center">
                                        <div class="col-md-6 mx-auto">
                                            <ul class="list-unstyled menu">
                                                <li><a href="profil.html">Profil</a></li>
                                                <li><a href="halutLogin1">Halaman Utama</a></li>
                                                <li><a href="kamar.html">Kamar</a></li>                      
                                                <li class="active"><a href="booking.html">Booking</a></li>
                                                <li><a href="pembayaran.html">Pembayaran</a></li>
                                                <li><a href="login.html">Logout</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!-- END head -->
        <section class="site-hero inner-page overlay" style="background-image: url(images/hero_4.jpg)" data-stellar-background-ratio="0.5">
            <div class="container">
                <div class="row site-hero-inner justify-content-center align-items-center">
                    <div class="col-md-10 text-center" data-aos="fade">
                        <h1 class="heading mb-3">Silahkan Booking</h1>
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

                        <form name="bookingForm" action="Booking" method="post" class="bg-white p-md-5 p-4 mb-5 border">
                            <div class="row">
                                <div class="col-md-6 form-group">
                                    <label class="text-black font-weight-bold" for="name">Nama</label>
                                    <input type="text" id="name" name="namaCust" class="form-control ">
                                </div>
                                <div class="col-md-6 form-group">
                                    <label class="text-black font-weight-bold" for="phone">Telepon</label>
                                    <input type="text" id="phone" name="teleponCust" class="form-control ">
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-12 form-group">
                                    <label class="text-black font-weight-bold" for="email">Email</label>
                                    <input type="email" id="email" name="emailCust" class="form-control ">
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6 form-group">
                                    <label class="text-black font-weight-bold" for="checkin_date">Check In</label>
                                    <input type="text" id="checkin_date" name="checkinCust" class="form-control">
                                </div>
                                <div class="col-md-6 form-group">
                                    <label class="text-black font-weight-bold" for="checkout_date">Check Out</label>
                                    <input type="text" id="checkout_date" name="checkoutCust" class="form-control">
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6 form-group">
                                    <label for="adults" class="font-weight-bold text-black">Jumlah Tamu</label>
                                    <div class="field-icon-wrap"></div>
                                    <div class="icon"></div>
                                    <select name="jumlahTamu" id="Tamu" class="form-control">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                    </select>
                                </div>
                                <div class="col-md-6 form-group">
                                    <label for="Cabang" class="font-weight-bold text-black">Cabang</label>
                                    <div class="field-icon-wrap"></div>
                                    <div class="icon"></div>
                                    <select name="Cabang" id="Cabang" class="form-control">
                                        <option value="Bali">Bali</option>
                                        <option value="Yogyakarta">Yogyakarta</option>
                                    </select>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6 form-group">
                                    <label for="adults" class="font-weight-bold text-black">Jenis Kamar</label>
                                    <div class="field-icon-wrap"></div>
                                    <div class="icon"></div>
                                    <select name="JenisKamar" id="Kamar" class="form-control" onclick="return jmlKamar()">
                                        <option onclick="return jmlKamar()" value="Single Room">Single Room</option>
                                        <option onclick="return jmlKamar()" value="Family Room">Family Room</option>
                                        <option onclick="return jmlKamar()" value="Presidential Room">Presidential Room</option>
                                    </select>
                                </div>
                                <div class="col-md-6 form-group">
                                    <p><p>
                                    <button onclick="return cekKamar()" type="submit" value="cekKamar" class="btn btn-light text-black py-2 px-3 font-weight-light" formaction="bookingS" formmethod="GET">Cek Kamar</button>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12 form-group">
                                    <label class="text-black font-weight-bold" for="harga">Harga</label>
                                    <textarea name="ca" id="message" class="form-control " cols="30" rows="5" readonly >Single Room = Rp 500.000,00
Family Room = Rp 750.000,00
Presidential Room = Rp 1.000.000,00 </textarea>
                                </div>
                            </div>
                            <div class="row mb-4">
                                <div class="col-md-12 form-group">
                                    <label class="text-black font-weight-bold" for="message">Catatan</label>
                                    <textarea name="catatanCust" id="message" class="form-control " cols="30" rows="8"></textarea>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6 form-group">
                                    <button onclick="return notifReserve()" type="submit" value="Reserve Now" class="btn btn-primary text-white py-3 px-5 font-weight-bold">Reserve Now</button>
                                </div>

                            </div>
                        </form>

                    </div>
                    <div class="col-md-5" data-aos="fade-up" data-aos-delay="200">
                        <div class="row">
                            <div class="col-md-10 ml-auto contact-info">
                                <p><span class="d-block">Alamat:</span> <span class="text-black"> Jalan Stadion Nomor 331, Tajem, Maguwoharjo, Depok, Sleman, Yogyakarta</span></p>
                                <p><span class="d-block">Nomor Telepon:</span> <span class="text-black"> (0274) 433 2059</span></p>
                                <p><span class="d-block">Email:</span> <span class="text-black"> ariarooms@gmail.com</span></p>
                            </div>
                        </div>
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