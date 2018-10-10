package OOP;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee worker1 = new Employee();
		
		worker1.setfName("Hannah");
		worker1.setlName("Montana");
		worker1.setSalary(100000);
		
		worker1.raiseSalary(10);

		System.out.println(worker1.getSalary());
		
		double bonus = worker1.getBonus(25);
		
		System.out.println(bonus);
		
		worker1.print();
	}

}
