package aug8.pack;



class Student{
	  
	private String name;
	private int rollNumber;
	private double marks;
	
	Student(String name, int rollNumber, double marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	void display()
	{
		
		System.out.println("Student name is : " + this.name
				           +"\nStudent rollNumber is : " + this.rollNumber
         		           +"\nStudent mark is  : "+this.marks);
	}
	
}

public class ConstructorTask1 {

	public static void main(String[] args) {
		
		Student s = new Student("saran", 5, 88);
        s.display();
	}

}
