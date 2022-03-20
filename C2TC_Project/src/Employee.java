// parameterized constructor
public class Employee {
	String name;
	int emp_id;
	Employee(String name,int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Pratik",100);
		Employee e2=new Employee("Vaibhav",101);

		
		System.out.println("Employee 1 : "+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2 : "+e2.name+" "+e2.emp_id);

	}
}
