package djb.nine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
public class GoContr {

	@Autowired
	private UserRepo userrep;


	   @GetMapping("getForm")
	    public String getForm() {
	       return "employeeForm";
	    }

	   @GetMapping("login")
	   public String loginn() {
	      return "login";
	   }
	   
	   
	   

	@GetMapping(path="/getall")
	public @ResponseBody Iterable<Employee> getAllUsers() {
		System.out.println("Inside getall");
		
		return userrep.findAll();
	}


	@PostMapping(path="/getemp")
	public @ResponseBody Employee getdet(@RequestParam("employeeid") String employeeid, @RequestParam("employeename") String employeename) {
	    System.out.println(employeeid);
	    System.out.println(employeename);
		System.out.println("Inside getemp");
		
		return userrep.getemp(employeeid, employeename);
		//System.out.println(abc.get(0));
		
	}




	@PostMapping("/login")
	public String login(@RequestParam("employeeid") String employeeid,@RequestParam("employeename") String employeename,@RequestParam("employeeemail") String employeeemail,@RequestParam("employeephone") String employeephone,@RequestParam("employeeaddress") String employeeaddress,@RequestParam("employeepassword") String employeepassword, ModelMap modelMap)
	{

		Employee emp=new Employee(employeeid, employeename,employeeemail, employeephone, employeeaddress,employeepassword);
		
		System.out.println("Employee login---->");
	   System.out.println("Employee ID"+employeeid);	
		
		if(employeeid==""||employeename==""||employeephone==""||employeepassword=="")
		{
			System.out.println("Inside if statement which says the value is null");
			return "employeeForm";
		}
		
		
		if(userrep.checkempid(employeeid)!=null) {
			System.out.println("Inside check emp id");
			return "employeeForm";
		}
		
		
		

		//modelMap.addAttribute(emp);
	   userrep.save(emp);
		//System.out.println(employees.getEmployeeaddress().toString());
		/*if(employeeaddress.length()==employeeaddress.trim().length())
		{
			return "/employeeForm";
		}
		else {*/
	/*String empn=emp.getEmployeeid();
	System.out.println(empn);
		String abcd=    userrep.findbyempId();*/
		

	/*String abc=	userrep.useId(12);
		
	//String abc=userrep.useId(employeeid);*/
	/*System.out.println(abcd);

	String def=userrep.findbynameandpwd();
	System.out.println("-------------------");

	System.out.println(def);*/
	System.out.println("-------------------");
	System.out.println("Inside login which is using query");
		return "/login";
	}



	@PostMapping("/retrieve")
	public String retrieve(@RequestParam("employeeid") String employeeid,
	                              @RequestParam("employeepassword") String employeepassword) {
		System.out.println("Inside retrieve");
		
		//   Employee emp=new Employee(employeeid, employeename);
	     //  userrep.save(emp);
	/*       System.out.println(button.);
		if(button.contentEquals("manager"))
		{
			return "manger";
		}*/
		//System.out.println(userrep.findbyidandpwd());
	if(userrep.findbyidandpwd(employeeid,employeepassword)!=null)
	{
		System.out.println("will call getall");
		return "showalldetails";
	}
		
		
		
			return "/login";
		
					
	}

	@PostMapping("/alldetails")
	public String alldetails(@RequestParam("employeeid") String employeeid, @RequestParam("employeename") String employeename, ModelMap modelMap)
	{
		System.out.println("Inside alldetails");
		  modelMap.put("employeeid", employeeid);
	      modelMap.put("employeename", employeename);
		//Employee emp=new Employee(employeeid, employeename);

		return "showalldetails";
	}




	    @PostMapping("/saveDetails")             
	    public String saveDetails(
	    		@RequestParam("employeeid") String employeeid,
	                              @RequestParam("employeename") String employeename,
	                              ModelMap modelMap) {
	   // Employee emp=new Employee(employeeid, employeename);
	     //   userrep.save(emp);
	        modelMap.put("employeeid", employeeid);
	        modelMap.put("employeename", employeename);
	        //userrep.save(employee);
	        return "viewDetails";

	       
	    
	    
	    
	    }
	    
	    
	    
	    /*
	    @GetMapping(path="/emp/{id}")
	    public @ResponseBody String getUsers(@PathVariable("id") Integer id)
	    {
	    	System.out.println("Inside emp---> ID");
	    	Employee det=userrep.findOne(id);
	    	return det.getEmployeename();
	    }
	    */
	    
	    /*@PostMapping("/login")
	    @Query("SELECT employeename FROM employee where employeeid = :employeeid") 
	    public String useId(@RequestParam("employeeid") String employeeid) {
	    	
	    	System.out.println("Inside UseId");
	    return "abc";	
	    };*/
	    
	    


}
