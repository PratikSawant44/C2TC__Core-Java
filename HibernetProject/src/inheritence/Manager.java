package inheritence;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

//Single Table Inheritance
//@DiscriminatorValue("MANAGER")

//Table Per Class Inheritance 
//@Table(name = "manager1")


//Join Table Inheritance 
@Table(name = "manager2")


public class Manager extends Employee {
	
	private static final long serialVersionUID =1L;
	
	
	@Column(name = "Department_Name")
	String deptName;
	Manager(){
	}
	public Manager(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}


