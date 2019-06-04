<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>FULL MOON</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
        integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style2.css">
</head>

<body>
    <!--  border-bottom border-dark -->
    <nav class="navbar navbar-expand-lg navbar-light bg-white container fixed-top">
        <div id="logoEmpresa">
            <!--Logo de la empresa -->
            <a href="principal.jsp"><img
                    src="images\logo.JPG" id="miniSo"></a>
        </div>
        <div class="collapse navbar-collapse justify-content-end pull-xs-right">
            <form class="form-inline" action="/action_page.php">
                <div class="form-group">
                    <span class="fa fa-search form-control-icon"></span>
                    <input class="form-control mr-sm-2 pull-left" type="text" placeholder="Search" aria-label="Search">
                </div>
            </form>
            <ul class="navbar-nav pull-right">
                <li class="nav-item active">
                    <a class="nav-link primero" href="#">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link primero" href="#"><i class="fas fa-heart icono"></i></a>
                </li>
                <li class="nav-item">
                  <!-- <i class="fas fa-cart-plus icono"></i> -->
                    <a class="nav-link primero" href="#"><i class="fas fa-shopping-cart grey-text icono" id="cart"></i></a>
                </li>
            </ul>
        </div>
        <span class="border-top my-3"></span>
    </nav>
  	<nav class="navbar navbar-expand-md fixed-top bg-light navbar-light container py-md-0" id="segunda">
        <div class="navbar-collapse collapse pt-2 pt-md-0" id="navbar2">
            <ul class="navbar-nav">
                <li class="nav-item dropdown segBarra">
                  <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Salud</a>
                  <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                  </div>
                </li>
                <li class="nav-item dropdown segBarra">
                  <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Belleza</a>
                  <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                  </div>
                </li>
                <li class="nav-item dropdown segBarra">
                  <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Cosmeticos</a>
                  <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                  </div>
                </li>
            </ul>
        </div>
    </nav>
  
  <!--Modal: Login / Register Form-->
    <!--Remplazar esto-->  
  <!--Remplazar esto-->
  <!--Remplazar esto-->
  <!--Modal: Login / Register Form-->
  <div class="modal fade" id="modalLRForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog cascading-modal" role="document">
      <!--Content-->
      <div class="modal-content">

        <!--Modal cascading tabs-->
        <div class="modal-c-tabs">

          <!-- Nav tabs -->
          <ul class="nav nav-tabs md-tabs tabs-2 light-blue darken-3" role="tablist">
            <li class="nav-item">
              <a class="nav-link active text-center card-title mt-2 float-center" data-toggle="tab" href="#panel7" role="tab"><i class="fas fa-user mr-1"></i>
                Ingresar</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-center card-title mt-2 float-center" data-toggle="tab" href="#panel8" role="tab"><i class="fas fa-user-plus mr-1"></i>
                Registrar</a>
            </li>
          </ul>

          <!-- Tab panels -->
          <div class="tab-content">
            <!--Panel 7-->
            <div class="tab-pane fade in show active" id="panel7" role="tabpanel">

              <!--Body-->
              <form action="loginServlet" method="post">
<!-- 

******************************* DENTRO DE ESTE FORM AGREGUE LAS ID Y NAME "txtUserLogin" Y "txtPwdLogin" *******************************

 -->              
              <div class="modal-body mb-1">
                <div class="md-form form-sm mb-5">
                  <i class="fas fa-envelope prefix"></i>
                  <label data-error="wrong" data-success="right" for="txtUserLogin">Nombre de Usuario</label>
                  <input type="text" id="txtUserLogin" name="txtUserLogin" class="form-control form-control-sm validate">
                </div>

                <div class="md-form form-sm mb-4">
                  <i class="fas fa-lock prefix"></i>
                  <label data-error="wrong" data-success="right" for="txtPwdLogin">Contraseña</label>
                  <input type="password" id="txtPwdLogin" name="txtPwdLogin" class="form-control form-control-sm validate">
                </div>
                <div class="text-center mt-2">
                  <input type="submit" class="btn btn-info" value="login" > <i class="fas fa-sign-in ml-1"></i></button>
                </div>
              </div>
            </form>
              <!--Footer-->
              <div class="modal-footer">
                <div class="options text-center text-md-right mt-1">
                  <p>¿Olvidaste tu <a href="#" class="blue-text">contraseña?</a></p>
                </div>
                <button type="button" class="btn btn-outline-info waves-effect ml-auto" data-dismiss="modal">Salir</button>
              </div>

            </div>
            <!--/.Panel 7-->

            <!--Panel 8-->
            <div class="tab-pane fade" id="panel8" role="tabpanel">

              <!--Body-->
              <form action="registerServlet" method="POST" >
                <div class="modal-body">
                  <div class="md-form form-sm mb-5">
                    <i class="fas fa-user-circle prefix"></i>
                    <label data-error="wrong" data-success="right" for="txtNombre">Nombre (s)</label>
                    <input type="text" id="txtNombre" name="txtNombre" class="form-control form-control-sm validate">
                  </div>

                  <div class="md-form form-sm mb-5">
                    <i class="fas fa-envelope prefix"></i>
                    <label data-error="wrong" data-success="right" for="txtApellido">Apellidos</label>
                    <input type="text" id="txtApellido" name="txtApellido" class="form-control form-control-sm validate">
                  </div>

                  <div class="md-form form-sm mb-5">
                    <i class="fas fa-envelope prefix"></i>
                    <label data-error="wrong" data-success="right" for="txtEmail">Email</label>
                    <input type="text" id="txtEmail" name="txtEmail" class="form-control form-control-sm validate">
                  </div>

                  <div class="md-form form-sm mb-5">
                    <i class="fas fa-lock prefix"></i>
                    <label data-error="wrong" data-success="right" for="txtPassword">Contraseña</label>
                    <input type="password" id="txtPassword" name="txtPassword" class="form-control form-control-sm validate">
                  </div>

                  <div class="md-form form-sm mb-4">
                    <i class="fas fa-lock prefix"></i>
                    <label data-error="wrong" data-success="right" for="modalLRInput14">Repetir contraseña</label>
<!-- 

******************************* CAMBIE EL input type a input type="password" Y EL ID ******************************* 

--> 
                    <input type="password" id="txtRepetirPassword" class="form-control form-control-sm validate">
                  </div>
                  <div class="text-center form-sm mt-2">
                    <input type="submit" class="btn btn-info"><i class="fas fa-sign-in ml-1" value="Registrar"></i></button>
                  </div>
                </div>
              </form>
              <!--Footer-->
              <div class="modal-footer">
                <div class="options text-right">
                  <p class="pt-1">¿Ya tienes una cuenta? <a href="#panel7" class="blue-text">Ingresa aquí</a></p>
                </div>
                <button type="button" class="btn btn-outline-info waves-effect ml-auto" data-dismiss="modal">Salir</button>
              </div>
            </div>
            <!--/.Panel 8-->
          </div>

        </div>
      </div>
      <!--/.Content-->
    </div>
  </div>
<!--Modal: Login / Register Form-->

<!--Remplazar esto-->  
<!--Remplazar esto-->
<!--Remplazar esto-->

  <!--Modal: Login / Register Form-->


  <!--Main Layout-->
    <div class="container" style="margin-top:120px">
        <!-- Section: Products v.4 -->
      <section class="text-center my-5">

      
        <!-- Grid row -->
    <div class="row">
        <div class="col-lg-3 col-md-6 mb-lg-0 mb-4 zoom">
          <div class="card card-cascade narrower card-ecommerce">
              <img src="images/1.JPG" class="card-img-top" id="foto1"
                alt="sample photo">
              <div class="card-body card-body-cascade text-center">
              <h4 class="card-title">
                <strong>
                  <a href="" class="text-dark" id="nombre1">Denim trousers</a>
                </strong>
              </h4>
              <!-- Card footer -->
              <div class="card-footer px-1">
                <span class="float-left font-weight-bold">
                  <strong id="precio1">49$</strong>
                </span>
                <span class="float-right">
                  <a class="text-dark" href="#" data-placement="top" title="Add to Cart">
                    <i class="fas fa-shopping-cart grey-text ml-3 carMenu"></i>
                  </a>
                  <a class="active text-dark"
                   href="#" data-placement="top" title="Added to Wishlist">
                    <i class="fas fa-heart ml-3 icono heartMenu"></i>
                  </a>
                </span>
              </div>
            </div>
          </div>
        </div>
        <!-- Grid column -->
    
        <!-- Grid column -->
        <div class="col-lg-3 col-md-6 mb-lg-0 mb-4 zoom">
          <div class="card card-cascade narrower card-ecommerce">
              <img src="images/2.JPG" class="card-img-top" id="foto2"
                  alt="sample photo">
              <div class="card-body card-body-cascade text-center">
              <h4 class="card-title">
                <strong>
                  <a href="" class="text-dark" id="nombre2">High heels</a>
                </strong>
              </h4>
              <!-- Card footer -->
              <div class="card-footer px-1">
                <span class="float-left font-weight-bold">
                  <strong id="precio2">89$</strong>
                </span>
                <span class="float-right">
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Cart">
                    <i class="fas fa-shopping-cart grey-text ml-3 carMenu"></i>
                  </a>
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Wishlist">
                    <i class="fas fa-heart grey-text ml-3 heartMenu"></i>
                  </a>
                </span>
              </div>
            </div>
          </div>
        </div>
    
        <!-- Grid column -->
        <div class="col-lg-3 col-md-6 mb-md-0 mb-4 zoom">
          <div class="card card-cascade narrower card-ecommerce">
              <img src="images/3.JPG" class="card-img-top" id="foto3"
                alt="sample photo">
              <div class="card-body card-body-cascade text-center">
              <h4 class="card-title">
                <strong>
                  <a href="" class="text-dark" id="nombre3">Brown coat</a>
                </strong>
              </h4>
              <!-- Card footer -->
              <div class="card-footer px-1">
                <span class="float-left font-weight-bold">
                  <strong id="precio3">59$</strong>
                </span>
                <span class="float-right">
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Cart">
                    <i class="fas fa-shopping-cart grey-text ml-3 carMenu"></i>
                  </a>
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Wishlist">
                    <i class="fas fa-heart grey-text ml-3 heartMenu"></i>
                  </a>
                </span>
              </div>
            </div>
          </div>
        </div>
    
        <!-- Grid column -->
        <div class="col-lg-3 col-md-6 zoom">
          <div class="card card-cascade narrower card-ecommerce">
              <img src="images/4.JPG" class="card-img-top" id="foto4"
                alt="sample photo">
              <div class="card-body card-body-cascade text-center">
              <h4 class="card-title">
                <strong>
                  <a href="" class="text-dark" id="nombre4">Shirt</a>
                </strong>
              </h4>
              <div class="card-footer px-1">
                <span class="float-left font-weight-bold">
                  <strong id="precio4">119$</strong>
                </span>
                <span class="float-right">
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Cart">
                    <i class="fas fa-shopping-cart grey-text ml-3 carMenu"></i>
                  </a>
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Added to Wishlist">
                    <i class="fas fa-heart ml-3 heartMenu"></i>
                  </a>
                </span>
              </div>
            </div>
          </div>
        </div>  
      </div>
  
  
  
      <!-- Grid row -->
      <div class="row" style="margin-top:115px">
        <div class="col-lg-3 col-md-6 mb-lg-0 mb-4 zoom">
          <div class="card card-cascade narrower card-ecommerce">
              <img src="images/5.JPG" class="card-img-top" id="foto5"
                alt="sample photo">
              <div class="card-body card-body-cascade text-center">
              <h4 class="card-title">
                <strong>
                  <a href="" class="text-dark" id="nombre5">Denim trousers</a>
                </strong>
              </h4>
              <!-- Card footer -->
              <div class="card-footer px-1">
                <span class="float-left font-weight-bold">
                  <strong id="precio5">49$</strong>
                </span>
                <span class="float-right">
                  <a class="text-dark" href="#" data-placement="top" title="Add to Cart">
                    <i class="fas fa-shopping-cart grey-text ml-3 carMenu"></i>
                  </a>
                  <a class="active text-dark"
                   href="#" data-placement="top" title="Added to Wishlist">
                    <i class="fas fa-heart ml-3 icono heartMenu"></i>
                  </a>
                </span>
              </div>
            </div>
          </div>
        </div>
        <!-- Grid column -->
    
        <!-- Grid column -->
        <div class="col-lg-3 col-md-6 mb-lg-0 mb-4 zoom">
          <div class="card card-cascade narrower card-ecommerce">
              <img src="images/6.JPG" class="card-img-top" id="foto6"
                  alt="sample photo">
              <div class="card-body card-body-cascade text-center">
              <h4 class="card-title">
                <strong>
                  <a href="" class="text-dark" id="nombre6">High heels</a>
                </strong>
              </h4>
              <!-- Card footer -->
              <div class="card-footer px-1">
                <span class="float-left font-weight-bold">
                  <strong id="precio6">89$</strong>
                </span>
                <span class="float-right">
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Cart">
                    <i class="fas fa-shopping-cart grey-text ml-3 carMenu"></i>
                  </a>
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Wishlist">
                    <i class="fas fa-heart grey-text ml-3 heartMenu"></i>
                  </a>
                </span>
              </div>
            </div>
          </div>
        </div>
    
        <!-- Grid column -->
        <div class="col-lg-3 col-md-6 mb-md-0 mb-4 zoom">
          <div class="card card-cascade narrower card-ecommerce">
              <img src="images/7.JPG" class="card-img-top" id="foto7"
                alt="sample photo">
              <div class="card-body card-body-cascade text-center">
              <h4 class="card-title">
                <strong>
                  <a href="" class="text-dark" id="nombre7">Brown coat</a>
                </strong>
              </h4>
              <!-- Card footer -->
              <div class="card-footer px-1">
                <span class="float-left font-weight-bold">
                  <strong id="precio7">59$</strong>
                </span>
                <span class="float-right">
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Cart">
                    <i class="fas fa-shopping-cart grey-text ml-3 carMenu"></i>
                  </a>
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Wishlist">
                    <i class="fas fa-heart grey-text ml-3 heartMenu"></i>
                  </a>
                </span>
              </div>
            </div>
          </div>
        </div>
    
        <!-- Grid column -->
        <div class="col-lg-3 col-md-6 zoom">
          <div class="card card-cascade narrower card-ecommerce">
              <img src="images/8.JPG" class="card-img-top" id="foto8"
                alt="sample photo">
              <div class="card-body card-body-cascade text-center">
              <h4 class="card-title">
                <strong>
                  <a href="" class="text-dark" id="nombre8">Shirt</a>
                </strong>
              </h4>
              <div class="card-footer px-1">
                <span class="float-left font-weight-bold">
                  <strong id="precio8">119$</strong>
                </span>
                <span class="float-right">
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Add to Cart">
                    <i class="fas fa-shopping-cart grey-text ml-3 carMenu"></i>
                  </a>
                  <a class="text-dark" href="#" data-toggle="tooltip" data-placement="top" title="Added to Wishlist">
                    <i class="fas fa-heart ml-3 heartMenu"></i>
                  </a>
                </span>
              </div>
            </div>
          </div>
        </div>  
            </div>
  <!--Main Loyout-->

            <ul class="pagination justify-content-center" style="margin-top:60px">
              <li class="page-item disabled"><a class="page-link" href="#">Previous</a></li>
              <li class="page-item"><a class="page-link" href="#">1</a></li>
              <li class="page-item"><a class="page-link" href="#">2</a></li>
              <li class="page-item"><a class="page-link" href="#">3</a></li>
              <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
    
    <!-- Footer -->
    <footer class="page-footer font-small mdb-color pt-4 container">
        <div class="container text-center text-md-left">
            <hr>
            <div class="row d-flex align-items-center">
                <div class="col-md-7 col-lg-8">
                    <p class="text-center text-md-left">&copy; 2018 Copyright:Cohort 13
                    </p>
                </div>
                <div class="col-md-5 col-lg-4 ml-lg-0">
                    <div class="text-center text-md-right">
                        <ul class="list-unstyled list-inline">
                            <li class="list-inline-item">
                                <a class="btn-floating btn-sm rgba-white-slight mx-1">
                                    <i class="fab fa-facebook-f"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a class="btn-floating btn-sm rgba-white-slight mx-1">
                                    <i class="fab fa-google"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a class="btn-floating btn-sm rgba-white-slight mx-1">
                                    <i class="fab fa-instagram"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    
    <script src="scripts/script.js"></script>
</body>
