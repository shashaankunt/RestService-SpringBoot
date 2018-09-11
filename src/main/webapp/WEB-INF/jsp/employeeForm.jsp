<html>
<head>
    <title>spring boot form submit example</title>
</head>
<body>
<h4>Registration Form</h4>


<form method="post" action="login">
    Employee ID : <input type="text" name="employeeid" id="empid" required/>
    <br>
    Full Name: <input type="text" name="employeename" id="empemail" >
    <br>
     <br>
    Email Address: <input type="email" name="employeeemail" id="empemail" >
    <br>
     <br>
    Employee Phone number: <input type="text" pattern="[0-9]{10}" name="employeephone" id="empphone" >
    <br>
      <br>
    Mailing Address: <input type="text" name="employeeaddress" id="empadd" >
    <br>
    <br>
    Password: <input type="text" name="employeepassword" id="emppwd" minlength=10 maxlength=30>
    <br>
    <fieldset>
     <div>
            <input type="radio" id="Manager" name="button"  />
            <label for="Manager">Manager</label>
        </div>

        <div>
            <input type="radio" id="User" name="button" checked/>
            <label for="User">User</label>
    </fieldset>
    <br>
    
    <input type="submit" value="Submit">
</form>
</body>
</html>
