package inheritence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity


//Single Table Inheritance
//@Table(name = "employee") //step 1-  
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//step 2 mention  type of inheritance 
//@DiscriminatorColumn(name = "employeeType", discriminatorType = DiscriminatorType.STRING)//add column to table
//@DiscriminatorValue("EMPLOYEE")

//Table Per Class Inheritance
//@Table(name = "employee1")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)


//Joined Two Tables
@Table(name = "employee2")
@Inheritance(strategy = InheritanceType.JOINED)

public class Employee implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int employeeId;
	
	@Column(name ="Name")
	String  employeeName;
	
	@Column(name = "Salary")
	double employeeSalary;
	
	
	Employee(){
	}
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
}

