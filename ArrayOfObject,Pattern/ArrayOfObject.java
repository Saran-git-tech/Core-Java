package aug27.pack;


class Employee {
	
	int id;
	String name;
	int age;
	int salary;
	String Department;
	
	
	public Employee(int id, String name, int age, int salary, String Department) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.Department = Department;
	}
   
  public String toString() {
	  
	  return "EmployeeId : "+id 
			  + " Employee Name : " +name
			  + " Employee Age : "+age
			  + " Employee Salary : " +salary
			  + " Employee Department : "+Department ;
 }
  
}
	
public class ArrayOfObject{
	
	public static void main(String[] args) {
		
		 Employee[] employee = new Employee[] {new Employee (1, "Jessie",25, 40000,"Developer"),new Employee(2, "Walter",54, 70000,"Manager"),
				                               new Employee(3, "Jimmy",48, 40000,"Sales"), new Employee(4, "Guts",20, 10000,"Junior Analyst")};	

		 
	   for(Employee e : employee)
		 {
			 System.out.println(e);
		 }

		 
	}
}
