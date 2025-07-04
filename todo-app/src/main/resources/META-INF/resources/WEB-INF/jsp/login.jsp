<html>
    <head>
        <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet"></link>
        <title>Welcome to Login Page</title>
    </head>
    <body>
        <div class="container">
            <p>Welcome to Login Page</p>
            <hr>
            <p>${errorMessage}</p>
            <form method="post">
                <p>Username: <input type="text" name="username"></p>
                <p>Password: <input type="password" name="password"></p>
                <p><input class="btn btn-success" type="submit"></p>
            </form>
        </div>
        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>