package mainpack;

/**
 * 
 * @author abaghe
 * 
 */
abstract class Employee {
	public abstract void netSalary();
}

class ConfirmedEmployee extends Employee {
	public void netSalary() {
		System.out.println("Confimed Employee's Salary");
	}
	public void transport(){
		System.out.println("Transport for permanent employee");
	}
}

class Intern extends Employee {
	public void netSalary() {
		System.out.println("Intern's Salary");
	}
}
class Contract extends Employee{
	public void netSalary() {
		System.out.println("contract's Salary");
	}
}
class HR {
	public Employee recruit(String empType) {

		if (empType.equals("I")) {
			return new Intern();
		} else if (empType.equals("C")) {
			return new ConfirmedEmployee();
		} 
		else if (empType.equals("T")) {
			return new Contract();
		}else
			return null;
	}
}
class Finance{
	public void processSalary(Employee emp){
		emp.netSalary();
		if(emp instanceof ConfirmedEmployee){
			ConfirmedEmployee conf=(ConfirmedEmployee)emp;
		      conf.transport();
		}
	}
}
public class MainApp {
	public static void main(String args[]) {
		HR hr = new HR();
		Finance finance=new Finance();
		Employee employee = hr.recruit("I");
		if (employee != null) {
			finance.processSalary(employee);
		}
		employee = hr.recruit("C");
		if (employee != null) {
			finance.processSalary(employee);
		}
		employee = hr.recruit("T");
		if (employee != null) {
			finance.processSalary(employee);    
		}
	}
}
