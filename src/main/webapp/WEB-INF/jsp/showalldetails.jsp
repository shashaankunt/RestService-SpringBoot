<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring boot form submit example</title>
</head>
<body>

<h2> Details as submitted successfully </h2>
<form method="get" action="/getall">
Hit submit for all details<input type= "submit" value="submit">

</form>

<form method="post" action="/getemp">
User Id : <input type="text" name="employeeid" id="empname"/>
    <br>
    User Name: <input type="text" name="employeename" id="empname" >
    <br>
    
    <input type="submit" value="Submit">
    


</form>
</body>
</html>
