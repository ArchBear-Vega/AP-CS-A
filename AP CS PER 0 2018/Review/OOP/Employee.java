package OOP;

public class Employee {

	private double salary;
	private String fName;
	private String lName;

	public Employee() {
		
		this.setSalary(0);
		this.setfName("");
		this.setlName("");
	}

	public Employee(double salary, String fName, String lName) {
		
		this.setSalary(salary);
		this.setfName(fName);
		this.setlName(lName);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void raiseSalary(double percent) {
		salary *= 1 + percent / 100;
	}

	public double getBonus(double percent) {

		return salary * percent / 100;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
}
