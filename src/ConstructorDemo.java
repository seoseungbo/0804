
public class ConstructorDemo {
	public static void main(String[] args) {
		Employee jimin = new Employee("2022-001", "박지민");
		
		
		jimin.setSalary(100000);
		jimin.setHiredate("2022-08-04");
		jimin.myPrint();
	}
}
