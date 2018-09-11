package djb.nine;

import java.util.List;

import javax.management.loading.ClassLoaderRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserRepo extends CrudRepository<Employee, Integer> {

	@Query("SELECT employeename FROM employee where employeename = 'abc' ")
	public String findbyempId() ;
	
	@Query("select employeename from employee where employeename='abc' and employeeid=12 ")
	public String findbynameandpwd();
	
	@Query("select employeename from employee where employeeid=?1 and employeepassword=?2")
	public String findbyidandpwd(String id, String pwd);
	
	@Query("select employeeid from employee where employeeid=?1")
	public String checkempid(String empid);
	
	@Query(value="select * from employee where employeeid=?1 or employeename=?2", nativeQuery=true)
	public Employee getemp(String employeeid, String employeename);
	
}
