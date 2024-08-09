package aug9.pack;

//Helper Class
class Student{
	
	Student(int rollNo, String name){
		
		System.out.println("rollNo : " + rollNo +"\nname : "+ name +"\n");
		
	}
	
	Student(int rollNo, String name, int markObtained){
		
		System.out.println("rollNo : " + rollNo +"\nname : "+ name 
				+ "\nmarkObtained : " + markObtained +"\n");
	}
	
	Student(int rollNo, String name, int markObtained, int totalMark)
	{
	
		System.out.println("rollNo : " + rollNo +"\nname : "+ name 
				+ "\nmarkObtained : " + markObtained
				+"\ntotalMark : " + totalMark);
	}
	
	
}

//Driver class
public class ConstructorOverLoadingTask {

	public static void main(String[] args) {
	 
           Student s = new Student(1,"saran"); 
           Student s1 = new Student(2,"tamil",87);
           Student s2 = new Student(3,"alex",88,100);
           
	}

}
