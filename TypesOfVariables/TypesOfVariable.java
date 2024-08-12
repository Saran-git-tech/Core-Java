package aug12.pack;


public class TypesOfVariable {

	 public String name; //instance variable
	 public int id;
	 
	 static int staticV = 11; //static variable
	 
	 public TypesOfVariable(String name, int id){
		 this.name = name;
		 this.id = id;
	 }
	 
	 
	 public void instance()
	 {
		 System.out.println("Name : " + name + "\nId : "+id +"\n");
	 }
	 
	 
//local variable example
	 
	 public void local()
	  {
		 int num1 = 3 ; // local variable
		 int num2 = 1;
		 
		 System.out.println("Sum : " + ( num1 + num2) +"\n");
	  }

	public static void main(String[] args)
	{
		TypesOfVariable tv = new TypesOfVariable("saran", 10);
		tv.instance();
		tv.local();
	
		System.out.println("Static Variable : "+TypesOfVariable.staticV);
	
	}
}
