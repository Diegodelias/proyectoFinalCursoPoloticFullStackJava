<%-- 
    Document   : login
    Created on : 13/12/2020, 20:47:25
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
</head>
<body>
    <div class="login" >
        <h1>Login</h1>
        <form method="post" action="loginServlet">
            <input type="text" name="usuario" placeholder="usuario" required="required" />
            <input type="password" name="password" placeholder="password" required="required" />
            <button type="submit" class="btn btn-primary btn-block btn-large">Entrar</button>
        </form>
    </div>
</body>
</html>