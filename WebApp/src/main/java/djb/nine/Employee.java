package djb.nine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="employee")
public class Employee {

	public Employee() {
		
	}
	public Employee(String employeeid, String employeename, String employeephone, String employeeemail,
			String employeepassword, String employeeaddress) {
		//super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeephone = employeephone;
		this.employeeemail = employeeemail;
		this.employeepassword = employeepassword;
		this.employeeaddress = employeeaddress;
	}
/*	public Employee(String employeeid, String employeename)
	{
		this.employeeid=employeeid;
		this.employeename=employeename;
	}*/
	
	
@Id
@Column(name="employeeid")
private String employeeid;


@Column(name="employeename")
private String employeename;
@Column(name="employeephone")
private String employeephone;
@Column(name="employeeemail")
private String employeeemail;
@Column(name="employeepassword")
private String employeepassword;
@Column(name="employeeaddress")
private String employeeaddress;
public String getEmployeeaddress() {
	return employeeaddress;
}

public void setEmployeeaddress(String employeeaddress) {
	this.employeeaddress = employeeaddress;
}

public String getEmployeephone() {
	return employeephone;
}

public void setEmployeephone(String employeephone) {
	this.employeephone = employeephone;
}

public String getEmployeeemail() {
	return employeeemail;
}

public void setEmployeeemail(String employeeemail) {
	this.employeeemail = employeeemail;
}

public String getEmployeepassword() {
	return employeepassword;
}

public void setEmployeepassword(String employeepassword) {
	this.employeepassword = employeepassword;
}




	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	public void setnamewhenId(String employeeid, String employeename) {
		if(this.employeeid==this.getEmployeeid()) {
			this.employeename=employeename;
		}
		
	}
	


 }