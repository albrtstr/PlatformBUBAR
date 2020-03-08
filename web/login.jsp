<!DOCTYPE html>
<!--halaman login
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

    <head>
        <script type="text/javascript">
            function login() {
                var ganalar = document.forms["loginForm"]["username"].value;
                var ganala1 = document.forms["loginForm"]["password"].value;
                if ((ganalar && ganala1) === "") {
                    alert("Data belum diisi!");
                    return false;
}
            }
        </script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        <section class="site-hero overlay" style="background-image: url(images/hero_4.jpg)" data-stellar-background-ratio="0.5">
            <div class="container">
                <div class="row site-hero-inner justify-content-center align-items-center">
                    <div class="col-md-10 text-center" data-aos="fade-up">
                        <span class="custom-caption text-uppercase text-white d-block  mb-3">SELAMAT DATANG DI ARIA ROOMS AND SWIMMING POOL <span class="fa fa-star text-primary"></span>   Hotel</span>
                        <h1 class="heading">SILAHKAN LOGIN</h1>
                    </div>
                </div>
            </div>            
        </section>
        <!-- END section -->
        <section class="section bg-light pb-0"  >
            <div class="container">
                <div class="row check-availabilty" id="next">
                    <div class="block-32" data-aos="fade-up" data-aos-offset="-200">
                        <form action="./login1" method="POST" name="loginForm">
                            <div class="row">
                                <div class="col-md-6 mb-3 mb-lg-0 col-lg-3">
                                    <label for="username" class="font-weight-bold text-black">USERNAME</label>
                                    <div class="field-icon-wrap">
                                        <div class="icon"><span class="icon-calendar"></span></div>
                                        <input name="username" type="text" id="username" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-6 mb-3 mb-lg-0 col-lg-3">
                                    <label for="password" class="font-weight-bold text-black">PASSWORD</label>
                                    <div class="field-icon-wrap">
                                        <div class="icon"><span class="icon-calendar"></span></div>
                                        <input name="password" type="password" id="password" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-6 col-lg-3 align-self-end">
                                    <button onclick="return login()" type=submit value="LOGIN" class="btn btn-primary btn-block text-white" name="buttonLogin">LOGIN</button>
                                </div>
                                <div class="col-md-6 col-lg-3 align-self-end">
                                    <a href="registrasi.jsp" class="btn btn-primary btn-block text-white">DAFTAR</a>
                                </div>
                            </div>
                        </form>
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