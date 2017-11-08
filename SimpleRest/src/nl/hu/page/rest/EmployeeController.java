package nl.hu.page.rest;
import java.util.Map;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.opensymphony.xwork2.ModelDriven;
public class EmployeeController implements ModelDriven<Object>{
	private String id;
	private Object model;
	private EmployeeRepository employeeRepository = new EmployeeRepository();
	private static Map<String,Employee> map;
	{
		map = employeeRepository.findAllEmployee();
	}
	public HttpHeaders index() {
		model = map;
		return new DefaultHttpHeaders("index").disableCaching();
	}
	public String add(){
		Integer empId = Integer.parseInt(id);
		Employee emp = new Employee(empId,"Ramesh", "PQR");
		model = emp;
		return "SUCCESS";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		model = employeeRepository.getEmployeeById(id);
		this.id = id;
	}

	public Object getModel() {
		return model;
	}
}   