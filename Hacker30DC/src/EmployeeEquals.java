
public class EmployeeEquals {
	
	int empId;
	String empname;
	public EmployeeEquals(String name) {
		empname=name;
	}
	



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEquals other = (EmployeeEquals) obj;
		if (empId != other.empId)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}


public static void main(String[] args) {
	EmployeeEquals e1=new EmployeeEquals("tom");
	EmployeeEquals e2=new EmployeeEquals("tom");
	System.out.println(e1.equals(e2));
	
}
}
