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
    //Employee mp=new Employee();
	
	
	
	
	
	
	
	
	
	 @PostMapping("/update")
	   public String update(@RequestParam("employeeid") String employeeid,
			   				@RequestParam("employeename") String employeename, 
			   				@RequestParam("employeeemail") String email, 
			   				@RequestParam("employeephone") String employeephone,
			   				@RequestParam("employeeaddress") String employeeaddress){
		   
		   Employee employee = new Employee();
		   
		   
		   String abc=userrep.findByName(employeeid);
		   System.out.println(abc);
		  if( abc==null) {
			  return "manager_updates";
		  }   
		   
		   
		   
		   
		   
		   
		   
		   employee = userrep.findEmpById(employeeid);
		 
		
		   employee.setEmployeename(employeename);
		   employee.setEmployeeaddress(employeeaddress);
		   employee.setEmployeeemail(email);
		   employee.setEmployeephone(employeephone);
		   
		   userrep.save(employee);
		   return "Hi";
	   }

      @PostMapping("/delete")
		public String delete(@RequestParam("employeeid") String employeeid, @RequestParam("employeename") String employeename) {
	    	System.out.println("Hi");
	    	System.out.println(employeeid);
	    	System.out.println(employeename);
	        //userrep.delete(employeeid);
	    	//userrep.delemp(employeeid);
	    	Employee employee = new Employee();
	    	
	    	employee=userrep.getemp(employeeid, employeename);
	    	if(employee==null)
	    	{
	    		return "manager_updates";
	    	}
	    	
	    	
	    	employee = userrep.getemp(employeeid, employeename);
	    	userrep.delete(employee);
	    	return "Hi";
		}
	
	
	
	//
	
	
   // @PostMapping("/delete")
//	public String delete(@RequestParam("employeeid") String employeeid, @RequestParam("employeename") String employeename) {
    	//System.out.println("Hi");
    	//System.out.println(employeeid);
    	//System.out.println(employeename);
    	//Integer gg=Integer.parseInt(employeeid);
    	//System.out.println(gg);
        //userrep.delete(gg);
    	//userrep.updemp("Updated by passing", employeeid);
    	//System.out.println("After gg");
	  // System.out.println(employeeid);
   
    	//mp.setEmployeename(employeename);
 	//   emp.setEmployeename(employeename); 	
    	//System.out.println("Before calling hi");
    //	return "Hi";
	//}
	
	
	   @GetMapping("getForm")
	    public String getForm() {
		   System.out.println("Get form");
		   
		   Employee mp= new Employee();
		   
		   
		   
		   
		   
		   
		   
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
		
	Employee emp=new Employee();
		if(userrep.getemp(employeeid, employeename)==null) {
			return emp;
		}
		
		System.out.println("before calling last function");
		return userrep.getemp(employeeid, employeename);
		//System.out.println(abc.get(0));
		
	}

	
	public static String djb() {
		System.out.println("Inside DJB");
		return "manager_updates";
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
		return "manager_updates";
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

	 @GetMapping("createForm")
	   public String createForm() {
	      return "manager_updates";
	   }
	   

	 @GetMapping("redirect")
	   public String redirect() {
	      return "manager_updates";
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
