<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
      <title>Web Application</title>
    <style type="text/css">
    	table {
    		border: 1px solid black;
		}
    	
    </style>
</head>
<body bgcolor="#F0F8FF">
<form method="post" action="/retrieve">
	<table align="center">
	<tr><td colspan="2" align="center"><h4>Login Form</h4></td></tr>
	<tr>
   	<td>User Id </td><td> <input type="text" name="employeeid" id="empname" required/></td>
   	</tr>
    <tr>
    <td>User Password </td><td><input type="password" name="employeepassword" id="emppwd" required></td>
    </tr>
    <tr>
    <td colspan="2" align="center"> 
    <input type="submit" value="Submit">
    </td>
    </tr>
    </table>
 </form>   
</body>
</html>
