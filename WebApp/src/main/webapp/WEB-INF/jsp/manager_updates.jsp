<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	  <title>Web Application</title>
<style type="text/css">
div.tab {
    overflow: hidden;
    border: 0px solid #000;
    background-color: #E6E6E6;
}

/* Style the buttons inside the tab */
div.tab button {
    background-color: inherit;
    float: left;
    border:  #000;
    outline: #000;
    cursor: pointer;
    padding: 16px 16px;
    transition: 0.3s;
}

/* Change background color of buttons on hover */
div.tab button:hover {
    background-color: #FFF;
}

/* Create an active/current tablink class */
div.tab button.active {
    background-color: white;
}

/* Style the tab content */
.tabcontent {
    display: none;
    padding: 7px 12px;
    border: 1px solid #000;
    border-top:#000;
	background-color:white
	
}
</style>
</head>
<body bgcolor="#F0F8FF">
<script>
function openCity(evt, cityName) {
    // Declare all variables
    var i, tabcontent, tablinks;

    // Get all elements with class="tabcontent" and hide them
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }

    // Get all elements with class="tablinks" and remove the class "active"
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }

    // Show the current tab, and add an "active" class to the button that opened the tab
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
}
</script>


<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'getall')">Retrieve all Employees</button>
  <button class="tablinks" onclick="openCity(event, 'getemp')">Retrieve a single employee</button>
  <button class="tablinks" onclick="openCity(event, 'update')">Update Employee</button>
  <button class="tablinks" onclick="openCity(event, 'delete')">Delete Employee</button>
</div>

<form action="/update" method="post">
<div id="update" class="tabcontent">
  <table border="0" cellspacing="7" cellpadding="9" align="center" width="50%">
	<tr><td colspan="2" align="center"><h4>Update Details</h4></td></tr>
    <tr><td>Employee ID </td><td><input type="text" name="employeeid" id="employeeid" required/></td></tr>
    <tr><td>Full Name</td> <td><input type="text" name="employeename" id="employeename" ></td></tr>
    <tr><td>Email Address</td><td> <input type="email" name="employeeemail" id="employeeemail" ></td></tr>
    <tr><td>Employee Phone number</td><td> <input type="text" pattern="[0-9]{10}" name="employeephone" id="employeephone" ></td></tr>
    <tr><td>Mailing Address</td><td> <input type="text" name="employeeaddress" id="employeeaddress" ></td></tr>
    <tr><td colspan="2" align="center">
  		<input type= "submit" value="Update Details"></td></tr>
    </table> 
</div>
</form>

<form method="get" action="/getall">
	<div id="getall" class="tabcontent">
  		<table border="0" cellspacing="7" cellpadding="9" align="center" width="50%">
    	<tr><td colspan="2" align="center">
  		Click the button for retrieving the employee details</td></tr>
  		<tr><td colspan="2" align="center">
  		<input type= "submit" value="Get Details"></td></tr>
  		</table>
	</div>
</form>

<form method="post" action="/getemp">
	<div id="getemp" class="tabcontent">
  		<table border="0" cellspacing="7" cellpadding="9" align="center" width="50%">
  		<tr>
  		Enter either Employee ID or Employee Name
  		</tr>
    	<tr>
        <td><label style="color:black"><b>Employee ID:</b></label></td>
	 	<td><input type="text" name="employeeid" id="employeeid" style= "border: 1.0px solid #000"><br></td>   
    	</tr>
    	<tr>
        <td><label style="color:black"><b>Employee name:</b></label></td>
	 	<td><input type="text" name="employeename" id="employeename"  style= "border: 1.0px solid #000"><br></td>   
   		</tr>
   		<tr><td colspan="2" align="center">
  		<input type= "submit" value="Get Employee Details"></td></tr>
  		</table>
  		</div>
</form>

<form method="post" action="/delete">
	<div id="delete"  class="tabcontent">
  	<table border="0" cellspacing="7" cellpadding="9" align="center" width="50%">
  	
    <tr>
        <td><label style="color:black"><b>Employee ID:</b></label></td>
	 	<td><input type="text" name="employeeid" id="employeeid" required="required" style= "border: 1.0px solid #000"><br></td>   
    </tr>
    <tr>
        <td><label style="color:black"><b>Employee name:</b></label></td>
	 	<td><input type="text" name="employeename" id="employeename" required="required" style= "border: 1.0px solid #000"><br></td>   
    </tr>
    <tr><td align="center" valign="top" colspan="2"><br>
          	<input type="submit" name="delete" value="Delete" style= "border: 1.0px solid #000">
            </td>
	</tr>
    </table>	
	</div>  
</form>

</body>
</html>