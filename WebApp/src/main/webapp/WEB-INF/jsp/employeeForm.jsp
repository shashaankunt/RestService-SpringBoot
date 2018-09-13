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

<form method="post" action="login">
	<table align="center">
	<tr><td colspan="2" align="center"><h4>Registration Form</h4></td></tr>
    <tr><td>Employee ID </td><td><input type="text" name="employeeid" id="empid" required/></td></tr>
    <tr><td>Full Name</td> <td><input type="text" name="employeename" id="empemail" ></td></tr>
    <tr><td>Phone Number</td><td> <input type="text" pattern="[0-9]{10}" name="employeeemail" id="empemail" required></td></tr>
    <tr><td>Email Address</td><td> <input type="email" name="employeephone" id="empphone" ></td></tr>
    <tr><td>Password</td><td> <input type="password" name="employeeaddress" id="empadd" minlength=10 maxlength=30 ></td></tr>
   	<tr><td>Address</td><td><input type="text" name="employeepassword" id="emppwd" ></td></tr>
    <tr>
	<td>Role</td>
	<td><input type="radio" id="Manager" name="button"  />
        <label for="Manager">Manager</label>
        <input type="radio" id="User" name="button" checked/>
        <label for="User">User</label>
    </td>
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
