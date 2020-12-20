package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import Logica.Controladora;
import Logica.Horario;
import Logica.Juego;
import java.util.List;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class EditarJuegos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <title>Dar de Alta empleado y usuarios</title>\n");
      out.write("\n");
      out.write("    <!-- Google Font: Source Sans Pro -->\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\"\n");
      out.write("    />\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/fontawesome-free/css/all.min.css\" />\n");
      out.write("    <!-- Ionicons -->\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\"\n");
      out.write("    />\n");
      out.write("    <!-- Tempusdominus Bootstrap 4 -->\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css\"\n");
      out.write("    />\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"plugins/icheck-bootstrap/icheck-bootstrap.min.css\"\n");
      out.write("    />\n");
      out.write("    <!-- JQVMap -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/jqvmap/jqvmap.min.css\" />\n");
      out.write("    <!-- Theme style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\" />\n");
      out.write("    <!-- overlayScrollbars -->\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"plugins/overlayScrollbars/css/OverlayScrollbars.min.css\"\n");
      out.write("    />\n");
      out.write("    <!-- Daterange picker -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\" />\n");
      out.write("    <!-- summernote -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/summernote/summernote-bs4.min.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body class=\"hold-transition sidebar-mini layout-fixed\">\n");
      out.write("      \n");
      out.write("        ");
  HttpSession misession = request.getSession();
      

        String formu = (String) request.getSession().getAttribute("usuario");
        
            if (formu == null) {
                
                response.sendRedirect("loginError.jsp");
            } else {
                
                Controladora control = new Controladora();
                
                misession.setAttribute("control", control);
            }
        
      
      
      
      
      
      
      
      
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <nav class=\"main-header navbar navbar-expand  navbar-light \">\n");
      out.write("    <!-- Left navbar links -->\n");
      out.write("    <ul class=\"navbar-nav d-flex justify-content-end\">\n");
      out.write("      <li class=\"nav-item \">\n");
      out.write("        <a class=\"nav-link \" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("  </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("      <!-- Main Sidebar Container -->\n");
      out.write("      <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\n");
      out.write("        <!-- Brand Logo -->\n");
      out.write("        <a href=\"index.jsp\" class=\"brand-link\">\n");
      out.write("         \n");
      out.write("          <span class=\"brand-text font-weight-light  ml-3\">Parque de diversiones</span>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("          <!-- Sidebar user panel (optional) -->\n");
      out.write("          <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\n");
      out.write("            <div class=\"image\">\n");
      out.write("              <img\n");
      out.write("                src=\"dist/img/user2-160x160.jpg\"\n");
      out.write("                class=\"img-circle elevation-2\"\n");
      out.write("                alt=\"User Image\"\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"info\">\n");
      out.write("              <a href=\"#\" class=\"d-block\"> \n");
      out.write("        ");
      out.print(request.getSession().getAttribute("usuario")     );
      out.write("</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("         \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <!-- Sidebar Menu -->\n");
      out.write("          <nav class=\"mt-2\">\n");
      out.write("           <ul\n");
      out.write("              class=\"nav nav-pills nav-sidebar flex-column\"\n");
      out.write("              data-widget=\"treeview\"\n");
      out.write("              role=\"menu\"\n");
      out.write("              data-accordion=\"false\"\n");
      out.write("            >\n");
      out.write("              <!-- Add icons to the links using the .nav-icon class\n");
      out.write("               with font-awesome or any other icon font library -->\n");
      out.write("              <li class=\"nav-item menu-close\">\n");
      out.write("                <a href=\"#\" class=\"nav-link active\">\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                  <i class=\"nav-icon fas fa-laugh\"></i>\n");
      out.write("                  <p>\n");
      out.write("                    Juegos\n");
      out.write("                    <i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"nav nav-treeview\">\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./altaJuego.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-plus\"></i>\n");
      out.write("                      <p class=\"ml-2\">Agregar Juego</p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("           \n");
      out.write("                  \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./ListarJuegos.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-list\"></i>\n");
      out.write("                      <p class=\"ml-2\">Listar Juego</p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("                \n");
      out.write("                         <li class=\"nav-item menu-close\">\n");
      out.write("                <a href=\"#\" class=\"nav-link active\">\n");
      out.write("                    <i class=\"fas fa-people-carry\"></i>\n");
      out.write("                \n");
      out.write("                  <p class=\"ml-2\">\n");
      out.write("                    Empleados y usuarios\n");
      out.write("                    <i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                    \n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"nav nav-treeview\">\n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./AltaEmpleado.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-plus\"></i>\n");
      out.write("                      <p class=\"ml-1\">Agregar empleado y usuario </p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("             \n");
      out.write("                  \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./ListarEmpleados.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-list\"></i>\n");
      out.write("                      <p class=\"ml-1\">Listar empleado y usuario </p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./EmpleadosPorJuego.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-list\"></i>\n");
      out.write("                      <p class=\"ml-1\">Listar empleados por juego </p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("                       \n");
      out.write("                       <li class=\"nav-item menu-close\">\n");
      out.write("                <a href=\"#\" class=\"nav-link active\">\n");
      out.write("                    <i class=\"fas fa-user-friends\"></i>\n");
      out.write("                    \n");
      out.write("                  <p class=\"ml-2\">\n");
      out.write("                    Clientes\n");
      out.write("                    <i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"nav nav-treeview\">\n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./CrearCliente.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-plus\"></i>\n");
      out.write("                      <p class=\"ml-1\">Agregar cliente </p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./ListarClientes.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-list\"></i>\n");
      out.write("                      <p class=\"ml-1\">Listar clientes </p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("             \n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("                                      \n");
      out.write("                       <li class=\"nav-item menu-close\">\n");
      out.write("                <a href=\"#\" class=\"nav-link active\">\n");
      out.write("              <i class=\"far fa-address-card\"></i>\n");
      out.write("                  <p class=\"ml-2\">\n");
      out.write("                    Entradas\n");
      out.write("                    <i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"nav nav-treeview\">\n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./CrearEntrada.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-plus\"></i>\n");
      out.write("                      <p class=\"ml-1\">Crear Entrada </p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                     <li class=\"nav-item\">\n");
      out.write("                    <a href=\"./ListarEntradas.jsp\" class=\"nav-link\">\n");
      out.write("                      <i class=\"fas fa-list\"></i>\n");
      out.write("                      <p class=\"ml-1\">Listar entradas vendidas </p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("         \n");
      out.write("          \n");
      out.write("              \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          </nav>\n");
      out.write("          <!-- /.sidebar-menu -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.sidebar -->\n");
      out.write("      </aside>\n");
      out.write("\n");
      out.write("      <!-- Content Wrapper. Contains page content -->\n");
      out.write("      <div class=\"content-wrapper\">\n");
      out.write("        <!-- Content Header (Page header) -->\n");
      out.write("        <div class=\"content-header\">\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row mb-2\">\n");
      out.write("              <div class=\"col-sm-6\">\n");
      out.write("                <h1 class=\"m-0\">Modificar juego</h1>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.col -->\n");
      out.write("              <div class=\"col-sm-6\">\n");
      out.write("                <ol class=\"breadcrumb float-sm-right\">\n");
      out.write("                  <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                  <li class=\"breadcrumb-item active\">Modificar juego</li>\n");
      out.write("                </ol>\n");
      out.write("              </div>\n");
      out.write("              <!-- /.col -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("          </div>\n");
      out.write("          <!-- /.container-fluid -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.content-header -->\n");
      out.write("\n");
      out.write("        <!-- Main content -->\n");
      out.write("        <section class=\"content\">\n");
      out.write("            <div class=\"container-fluid pb-3\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("         \n");
      out.write("                \n");
      out.write("                         \n");
      out.write("                \n");
      out.write("\n");
      out.write("                         \n");
      out.write("            \n");
      out.write("                                           \n");
      out.write("                ");

                          Controladora control =  new Controladora();
                          
                          
                          
        
                         long idjue = Long.parseLong( (String) request.getAttribute("idJue"));
                    
                         Juego juego = control.TaerJuegoEnParticular(idjue);
                         
                         Horario hora =  juego.getHorario();
                         
                         
                         
                         Date horarioInicial = hora.getHora_inicio();
                         Date horaFinal = hora.getHora_fin();
                         
                             
                  SimpleDateFormat formatter=new SimpleDateFormat("HH:mm");
                                                 
                   String horainicio=formatter.format(horarioInicial);
                  String horariofin=formatter.format( horaFinal);
                         
                         
                         
                         
                         
                         
                         
                                           
                          
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                    \n");
      out.write("                <form action=\"EditarListaJuego\" method=\"GET\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                            \n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        \n");
      out.write("                         <label for=\"nombreJuego\" >Nombre del juego:</label>\n");
      out.write("                      <input type=\"text\" name=\"nombreJuego\"  value=\"");
      out.print(  juego.getNombreJuego() );
      out.write("\" >\n");
      out.write("                      <input type=\"hidden\" name=\"txtid\" value=\"");
      out.print( juego.getId() );
      out.write("\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        \n");
      out.write("                         <label for=\"horaInicioActual\" >Hora inicio actual:</label>\n");
      out.write("                      <input type=\"text\" name=\"horaInicioActual\"  value=\"");
      out.print(  horainicio );
      out.write("\" >\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"horaInicio\">hora Inicio nueva:</label>\n");
      out.write("                        <input type=\"time\"  name=\"horaInicio\"  >\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                         \n");
      out.write("                 \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                        \n");
      out.write("                         <label for=\"horaInicioFinal\" >Hora fin actual:</label>\n");
      out.write("                      <input type=\"text\" name=\"horaInicioActual\"  value=\"");
      out.print(   horariofin );
      out.write("\" >\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                        \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"horaFin\">hora finalización juego nueva:</label>\n");
      out.write("                        <input type=\"time\" id=\"appt\" name=\"horaFin\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                \n");
      out.write("                \n");
      out.write("             \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\"   name=\"accion\" value=\"Actualizar\">Enviar</button>\n");
      out.write("                </form>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("          <!-- /.container-fluid -->\n");
      out.write("        </section>\n");
      out.write("        <!-- /.content -->\n");
      out.write("      </div>\n");
      out.write("      <!-- /.content-wrapper -->\n");
      out.write("      <footer class=\"main-footer\">\n");
      out.write("        <strong\n");
      out.write("          >Copyright &copy; 2014-2020\n");
      out.write("          <a href=\"https://adminlte.io\">AdminLTE.io</a>.</strong\n");
      out.write("        >\n");
      out.write("        All rights reserved.\n");
      out.write("        <div class=\"float-right d-none d-sm-inline-block\">\n");
      out.write("          <b>Version</b> 3.1.0-rc\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("      <!-- Control Sidebar -->\n");
      out.write("      <aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("        <!-- Control sidebar content goes here -->\n");
      out.write("      </aside>\n");
      out.write("      <!-- /.control-sidebar -->\n");
      out.write("    </div>\n");
      out.write("    <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"plugins/jquery/jquery.min.js\"></script>\n");
      out.write("    <!-- jQuery UI 1.11.4 -->\n");
      out.write("    <script src=\"plugins/jquery-ui/jquery-ui.min.js\"></script>\n");
      out.write("    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\n");
      out.write("    <script>\n");
      out.write("      $.widget.bridge(\"uibutton\", $.ui.button);\n");
      out.write("    </script>\n");
      out.write("    <!-- Bootstrap 4 -->\n");
      out.write("    <script src=\"plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <!-- ChartJS -->\n");
      out.write("    <script src=\"plugins/chart.js/Chart.min.js\"></script>\n");
      out.write("    <!-- Sparkline -->\n");
      out.write("    <script src=\"plugins/sparklines/sparkline.js\"></script>\n");
      out.write("    <!-- JQVMap -->\n");
      out.write("    <script src=\"plugins/jqvmap/jquery.vmap.min.js\"></script>\n");
      out.write("    <script src=\"plugins/jqvmap/maps/jquery.vmap.usa.js\"></script>\n");
      out.write("    <!-- jQuery Knob Chart -->\n");
      out.write("    <script src=\"plugins/jquery-knob/jquery.knob.min.js\"></script>\n");
      out.write("    <!-- daterangepicker -->\n");
      out.write("    <script src=\"plugins/moment/moment.min.js\"></script>\n");
      out.write("    <script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("    <!-- Tempusdominus Bootstrap 4 -->\n");
      out.write("    <script src=\"plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js\"></script>\n");
      out.write("    <!-- Summernote -->\n");
      out.write("    <script src=\"plugins/summernote/summernote-bs4.min.js\"></script>\n");
      out.write("    <!-- overlayScrollbars -->\n");
      out.write("    <script src=\"plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js\"></script>\n");
      out.write("    <!-- AdminLTE App -->\n");
      out.write("    <script src=\"dist/js/adminlte.js\"></script>\n");
      out.write("    <!-- AdminLTE for demo purposes -->\n");
      out.write("    <script src=\"dist/js/demo.js\"></script>\n");
      out.write("    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->\n");
      out.write("    <script src=\"dist/js/pages/dashboard.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
