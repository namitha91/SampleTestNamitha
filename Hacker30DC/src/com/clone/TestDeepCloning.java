package com.clone;



class Employee1 implements Cloneable{
	 
   private int empoyeeId;
   private String employeeName;
   private Department1 department;

   public Employee1(int id, String name, Department1 dept)
   {
       this.empoyeeId = id;
       this.employeeName = name;
       this.department = dept;
   }
  
	public int getEmpoyeeId() {
		return empoyeeId;
	}

	/*
	 * public void setEmpoyeeId(int empoyeeId) { this.empoyeeId = empoyeeId; }
	 * public String getEmployeeName() { return employeeName; }
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department1 getDepartment1() {
		return department;
	}
	public void setDepartment1(Department1 department) {
		this.department = department;
	}
    
	 @Override
	    protected Object clone() throws CloneNotSupportedException {
	        Employee1 EmpCloned=(Employee1)super.clone();
	        EmpCloned.setDepartment1((Department1)EmpCloned.getDepartment1().clone());
	      //  EmpCloned.d
	        return EmpCloned;
	        
	    }
}

class Department1 implements Cloneable
{
   private int id;
   private String name;

   
   
   public Department1(int id, String name)
   {
       this.id = id;
       this.name = name;
   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
@Override
protected Object clone() throws CloneNotSupportedException{
	return super.clone();
	
}

  
   
}

 public class TestDeepCloning {
	 
	 
	 
	    public static void main(String[] args) throws CloneNotSupportedException {
	    	
	    	
	        Department hr = new Department(1, "Human Resource");
	        Employee original = new Employee(1, "Admin", hr);
	        Employee cloned = (Employee) original.clone();
	 
	        //Let change the department name in cloned object and we will verify in original object
	        cloned.getDepartment().setName("Finance");
	 
	        System.out.println(original.getDepartment().getName());
	        System.out.println(cloned.getDepartment().getName());
	    }
	}
