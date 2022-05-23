package onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEmployeeId(52);
		employee.setEmployeeName("Pratik");
		
		Address ad = new Address();
		ad.setAddressId(1);
		ad.setAddressLine1("Yelavi");
		ad.setAddressLine2("Sangli");
		ad.setPincode(416416);
		ad.setState("MH");
	
		
		//ad.setEmployeeId(employee);
		
		employee.setEmployeeAddress(ad);
		
		
		//em.persist(employee);	
		em.persist(ad);
		
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
		
	}

}

	

