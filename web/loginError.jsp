<%-- 
    Document   : loginError
    Created on : 19/12/2020, 18:19:20
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="estilos.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
    <div class="login">
        <h1>Login incorrecto</h1>
        <div class="alert alert-danger alert-dismissible fade show">
            <strong>Error!</strong> revisa que usuario y contraseña sean los correctos
                    </div>
        <form method="post">
            
            
            <a href="login.jsp" class="btn btn-primary btn-block btn-large">Volver al login</a>
         
           
        </form>
    </div>
</body>
</html>