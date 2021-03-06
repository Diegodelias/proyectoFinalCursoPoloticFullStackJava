<%-- 
    Document   : EditarCliente
    Created on : 15/12/2020, 22:38:55
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Editar cliente</title>

    <!-- Google Font: Source Sans Pro -->
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback"
    />
    <!-- Font Awesome -->
    <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css" />
    <!-- Ionicons -->
    <link
      rel="stylesheet"
      href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css"
    />
    <!-- Tempusdominus Bootstrap 4 -->
    <link
      rel="stylesheet"
      href="plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css"
    />
    <!-- iCheck -->
    <link
      rel="stylesheet"
      href="plugins/icheck-bootstrap/icheck-bootstrap.min.css"
    />
    <!-- JQVMap -->
    <link rel="stylesheet" href="plugins/jqvmap/jqvmap.min.css" />
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/adminlte.min.css" />
    <!-- overlayScrollbars -->
    <link
      rel="stylesheet"
      href="plugins/overlayScrollbars/css/OverlayScrollbars.min.css"
    />
    <!-- Daterange picker -->
    <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css" />
    <!-- summernote -->
    <link rel="stylesheet" href="plugins/summernote/summernote-bs4.min.css" />
  </head>
  <body class="hold-transition sidebar-mini layout-fixed">
      
           
      <%  HttpSession misession = request.getSession();
      

        String formu = (String) request.getSession().getAttribute("usuario");
        
            if (formu == null) {
                
                response.sendRedirect("loginError.jsp");
            } else {
                
                Controladora control = new Controladora();
                
                misession.setAttribute("control", control);
            }
        
      
      
      
      
      
      
      
      %>
    <div class="wrapper">

    
        
        
    <nav class="main-header navbar navbar-expand  navbar-light ">
    <!-- Left navbar links -->
    <ul class="navbar-nav d-flex justify-content-end">
      <li class="nav-item ">
        <a class="nav-link " data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
     
    </ul>


 
  </nav>
        
        
        
        
        
        
        
        

        

      <!-- Main Sidebar Container -->
      <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="index.jsp" class="brand-link">
         
          <span class="brand-text font-weight-light  ml-3">Parque de diversiones</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
          <!-- Sidebar user panel (optional) -->
          <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
              <img
                src="dist/img/user2-160x160.jpg"
                class="img-circle elevation-2"
                alt="User Image"
              />
            </div>
            <div class="info">
              <a href="#" class="d-block">Admin</a>
            </div>
          </div>

         
          
          
          
          <!-- Sidebar Menu -->
          <nav class="mt-2">
            <ul
              class="nav nav-pills nav-sidebar flex-column"
              data-widget="treeview"
              role="menu"
              data-accordion="false"
            >
              <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
              <li class="nav-item menu-close">
                <a href="#" class="nav-link active">
                    
                  
                  <i class="nav-icon fas fa-laugh"></i>
                  <p>
                    Juegos
                    <i class="right fas fa-angle-left"></i>
                  </p>
                </a>
                <ul class="nav nav-treeview">
                  <li class="nav-item">
                    <a href="./altaJuego.jsp" class="nav-link">
                      <i class="fas fa-plus"></i>
                      <p class="ml-2">Agregar Juego</p>
                    </a>
                  </li>
           
                  
                     <li class="nav-item">
                    <a href="./ListarJuegos.jsp" class="nav-link">
                      <i class="fas fa-list"></i>
                      <p class="ml-2">Listar Juego</p>
                    </a>
                  </li>
                </ul>
              </li>
              
              
              
              
              
              
                         <li class="nav-item menu-close">
                <a href="#" class="nav-link active">
                    <i class="fas fa-people-carry"></i>
                
                  <p class="ml-2">
                    Empleados y usuarios
                    <i class="right fas fa-angle-left"></i>
                    
                  </p>
                </a>
                <ul class="nav nav-treeview">
                     <li class="nav-item">
                    <a href="./AltaEmpleado.jsp" class="nav-link">
                      <i class="fas fa-plus"></i>
                      <p class="ml-1">Agregar empleado y usuario </p>
                    </a>
                  </li>
             
                  
                     <li class="nav-item">
                    <a href="./ListarEmpleados.jsp" class="nav-link">
                      <i class="fas fa-list"></i>
                      <p class="ml-1">Listar empleado y usuario </p>
                    </a>
                  </li>
                  
                  
                  
                     <li class="nav-item">
                    <a href="./EmpleadosPorJuego.jsp" class="nav-link">
                      <i class="fas fa-list"></i>
                      <p class="ml-1">Listar empleados por juego </p>
                    </a>
                  </li>
                  
                  
                </ul>
              </li>
              
              
              
              
                       
                       <li class="nav-item menu-close">
                <a href="#" class="nav-link active">
                    <i class="fas fa-user-friends"></i>
                    
                  <p class="ml-2">
                    Clientes
                    <i class="right fas fa-angle-left"></i>
                  </p>
                </a>
                <ul class="nav nav-treeview">
                     <li class="nav-item">
                    <a href="./CrearCliente.jsp" class="nav-link">
                      <i class="fas fa-plus"></i>
                      <p class="ml-1">Agregar cliente </p>
                    </a>
                  </li>
                
                  
                  
                     <li class="nav-item">
                    <a href="./ListarClientes.jsp" class="nav-link">
                      <i class="fas fa-list"></i>
                      <p class="ml-1">Listar clientes </p>
                    </a>
                  </li>
                  
                  
                  
                  
             
                  
                </ul>
              </li>
              
              
              
              
                                      
                       <li class="nav-item menu-close">
                <a href="#" class="nav-link active">
              <i class="far fa-address-card"></i>
                  <p class="ml-2">
                    Entradas
                    <i class="right fas fa-angle-left"></i>
                  </p>
                </a>
                <ul class="nav nav-treeview">
                     <li class="nav-item">
                    <a href="./CrearEntrada.jsp" class="nav-link">
                      <i class="fas fa-plus"></i>
                      <p class="ml-1">Crear Entrada </p>
                    </a>
                  </li>
                
                  
                  
                     <li class="nav-item">
                    <a href="./ListarEntradas.jsp" class="nav-link">
                      <i class="fas fa-list"></i>
                      <p class="ml-1">Listar entradas vendidas </p>
                    </a>
                  </li>
                  
                  
                    <li class="nav-item">
                    <a href="./TodasEntradasVendidasDia.jsp" class="nav-link">
                      <i class="fas fa-list"></i>
                      <p class="ml-1">Listar entradas día </p>
                    </a>
                  </li>
                  
                  
                     <li class="nav-item">
                    <a href="./EntradasVendidasDiaPorJuego.jsp" class="nav-link">
                      <i class="fas fa-list"></i>
                      <p class="ml-1">Listar entradas día (juego) </p>
                    </a>
                  </li>
                  
                  
              
              
              
            </ul>
         
          
          
          
          
          
          </nav>
          <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <div class="content-header">
          <div class="container-fluid">
            <div class="row mb-2">
              <div class="col-sm-6">
                <h1 class="m-0">Dar de alta  Cliente</h1>
              </div>
              <!-- /.col -->
              <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                  <li class="breadcrumb-item"><a href="#">Home</a></li>
                  <li class="breadcrumb-item active">Editar  Cliente</li>
                </ol>
              </div>
              <!-- /.col -->
            </div>
            <!-- /.row -->
          </div>
          <!-- /.container-fluid -->
        </div>
        <!-- /.content-header -->

        <!-- Main content -->
        <section class="content">
            <div class="container-fluid pb-3">
                
                
                
                      <%@ page import ="Logica.Controladora,Logica.Cliente, Logica.Empleado,Logica.Juego,java.util.List" %>
                
                
                <%
                 Controladora ctrl = new Controladora();
                 
               
                  int id_cli = Integer.parseInt((String) request.getAttribute("idCli"));
                  
                   Cliente c = ctrl.TaerClienteEnParticular(id_cli);
              
          
                %>
                
                
                
                    
                <form action="CrudCliente" method="POST">
                    
                    
                      <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control"  placeholder="Ingrese nombre" name="nombre"  value="<%= c.getNombre() %>">
                       
                      </div>
                    
                 
                       
                     <div class="form-group">
                        <label for="apellido">Apellido</label>
                        <input type="text" class="form-control"  placeholder="Ingrese apellido" name="apellido" value="<%= c.getApellido()%>">
                       
                     </div>
                    
                    
                    
                         
                     <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="text" class="form-control"  placeholder="Ingrese número de telefono" name="telefono" value
                               ="<%= c.getTelefono()%>">
                       
                     </div>
                    
                    
                         
                     <div class="form-group">
                        <label for="dni">Dni</label>
                        <input type="text" class="form-control"  placeholder="dni" name="dni" value=" <%= c.getDni()%>">
                       
                     </div>
                    
                    
                  
                    
                    
                    
                    
                    
                    
               
                
                   
                    <button type="submit" class="btn btn-primary" value="Actualizar">Enviar</button>
                </form>
               
                
                
                
                
                
                
                
                
            </div>
          <!-- /.container-fluid -->
        </section>
        <!-- /.content -->
      </div>
      <!-- /.content-wrapper -->
      <footer class="main-footer">
        <strong
          >Copyright &copy; 2014-2020
          <a href="https://adminlte.io">AdminLTE.io</a>.</strong
        >
        All rights reserved.
        <div class="float-right d-none d-sm-inline-block">
          <b>Version</b> 3.1.0-rc
        </div>
      </footer>

      <!-- Control Sidebar -->
      <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
      </aside>
      <!-- /.control-sidebar -->
    </div>
    <!-- ./wrapper -->

    <!-- jQuery -->
    <script src="plugins/jquery/jquery.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="plugins/jquery-ui/jquery-ui.min.js"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
      $.widget.bridge("uibutton", $.ui.button);
    </script>
    <!-- Bootstrap 4 -->
    <script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- ChartJS -->
    <script src="plugins/chart.js/Chart.min.js"></script>
    <!-- Sparkline -->
    <script src="plugins/sparklines/sparkline.js"></script>
    <!-- JQVMap -->
    <script src="plugins/jqvmap/jquery.vmap.min.js"></script>
    <script src="plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
    <!-- jQuery Knob Chart -->
    <script src="plugins/jquery-knob/jquery.knob.min.js"></script>
    <!-- daterangepicker -->
    <script src="plugins/moment/moment.min.js"></script>
    <script src="plugins/daterangepicker/daterangepicker.js"></script>
    <!-- Tempusdominus Bootstrap 4 -->
    <script src="plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
    <!-- Summernote -->
    <script src="plugins/summernote/summernote-bs4.min.js"></script>
    <!-- overlayScrollbars -->
    <script src="plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
    <!-- AdminLTE App -->
    <script src="dist/js/adminlte.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="dist/js/demo.js"></script>
    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
    <script src="dist/js/pages/dashboard.js"></script>
  </body>
</html>
