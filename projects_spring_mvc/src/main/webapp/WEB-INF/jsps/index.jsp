<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <script type = "text/javascript">
            var ajax = new XMLHttpRequest();
            ajax.onreadystatechange = receiver;
            function receiver() {
//        console.log(ajax);
                if (ajax.readyState == 4 && ajax.status == 200) {
                    var array = JSON.parse(ajax.responseText);
                    printTable(array);
                    //console.log(array);
                    //document.getElementById('result').innerHTML = array;
                }
            }

            function methodAjax() {
                ajax.open('GET', '/userlist', true);
                console.log('methodAjax');
                ajax.send();
            }

            function printTable(array) {
                var table = document.createElement('table');
                table.setAttribute('border', '1');
                var placeholder = document.getElementById('btn');
                document.body.insertBefore(table, placeholder);

                var row = document.createElement('tr');
                var login = document.createElement('td');
                login.innerHTML = 'login';
                var pass = document.createElement('td');
                pass.innerHTML = 'pass';
                row.appendChild(login);
                row.appendChild(pass);
                table.appendChild(row);

                for (var element in array) {
                    var row = document.createElement('tr');
                    var login = document.createElement('td');
                    login.innerHTML = array[element].login;
                    var pass = document.createElement('td');
                    pass.innerHTML = array[element].pass;
                    row.appendChild(login);
                    row.appendChild(pass);
                    table.appendChild(row);
                }
            }
        </script>
    </head>
    <body>

    <%--<div>--%>
        <%--<form method="POST" action="/j_spring_security_check" class="login">--%>
            <%--<p>--%>
                <%--<label>Логин:</label>--%>
                <%--<input type="text" name="j_username" value="">--%>
            <%--</p>--%>

            <%--<p>--%>
                <%--<label>Пароль:</label>--%>
                <%--<input type="password" name="j_password"  value="">--%>
            <%--</p>--%>

            <%--<p >--%>
                <%--<button type="submit" class="login-button">Войти</button>--%>
            <%--</p>--%>

            <%--<p><a href="index.jsp">Забыл пароль?</a></p>--%>
            <%--<p><a href="index.jsp">Регистрация</a></p>--%>
        <%--</form>--%>
    <%--</div>--%>
    <button type = "button" onclick="methodAjax()" id="btn"> Refresh</button>
    <div id="myDiv"></div>
    <footer><a href="http://www.facebook.com/chuvendoil">made by Eugen Chyvuchyn © 2015</a></footer>
    </body>
</html>
