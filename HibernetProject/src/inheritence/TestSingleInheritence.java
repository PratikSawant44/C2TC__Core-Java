package inheritence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");//developed connnection with database
		EntityManager em = factory.createEntityManager();//operation on database//create update insert delete got object for communication
		em.getTransaction().begin();//start communication
		
		
		Employee e = new Employee();
		e.setEmployeeName("Pratik");
		e.setEmployeeSalary(10000);
		em.persist(e);//started communication 
		
		
		Manager m = new Manager();
		m.setEmployeeName("Vishal");
		m.setEmployeeSalary(30000);
		m.setDeptName("Training");
		em.persist(m);
		
		em.getTransaction().commit();//end of communication
		System.out.println("Rows Inserted");
		em.close();//communication
		factory.close();//connection
	}

}

