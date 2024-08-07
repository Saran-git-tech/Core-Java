package aug6.java.pack;

 class Employee{
	 
	 int EmployeeId;
	 String EmployeeName;
	 
	 void assign(int id,String name)
	 {
		 EmployeeId = id;
		 EmployeeName = name;
	 }
	 
	 void display() {
		 System.out.println(" Employee Id is : " +EmployeeId +" and " + "Employee Name is : "+ EmployeeName);
	 }
	 
 }

public class Task2 {
         
	
	public static void main(String[] args) {
		 
		Employee e = new Employee();
		e.assign(1, "saran");
		e.display();
	}

}
