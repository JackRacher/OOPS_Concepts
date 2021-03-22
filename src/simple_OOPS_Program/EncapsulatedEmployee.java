package simple_OOPS_Program;

class Employee{
	private int empNo;
	private String sname;
	private double salary;
	private Address address;
	
	
	
	public Employee(int empNo, String sname, double salary, Address address) {
		super();
		this.empNo = empNo;
		this.sname = sname;
		this.salary = salary;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	Employee(){
		System.out.println("Default");
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", sname=" + sname + ", salary=" + salary + ", address=" + address + "]";
	}

	public int hashCode() {
		return empNo;
	}
	
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.empNo == e.empNo && this.sname.equals(e.sname) && this.salary == e.salary;
	}
	
	
}
public class EncapsulatedEmployee {

	

	public static void main(String[] args) {
		Address address = new Address("7-16", "KPHB", "Hydrabad");
		Employee obj = new Employee();
		obj.setEmpNo(1001);
		obj.setSname("Ramu");
		obj.setSalary(21000);
		obj.setAddress(address);
		System.out.println(obj.toString());
		
		Employee obj1 = new Employee();
		obj1.setEmpNo(1001);
		obj1.setSname("Ramu");
		obj1.setSalary(21000);
		obj1.setAddress(address);
		System.out.println(obj1.toString());
		
		System.out.println(obj == obj1);
		
		System.out.println(obj.equals(obj1));

	}

}
