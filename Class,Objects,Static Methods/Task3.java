package aug6.java.pack;

public class Task3 {
 
      int num1;
      int num2;
      
      void insertNum(int num1, int num2)
      {
    	  this.num1 = num1;
    	  this.num2 = num2;
      }
      
      int sum() {
    	 return num1 + num2;
      }
      
      void sub() {
    	  System.out.println("Differnce of two numbers is : " + (num1-num2));
      }
      
      void multiply() {
    	  System.out.println("Multiply of two numbers is : " + (num1*num2));
      }
      
      void division() {
    	  System.out.println("Division of two numbers is : " + (num1/num2));
      }
      
      
      
      
	public static void main(String[] args) {
		
		Task3 t = new Task3();
		t.insertNum(7, 5);
		System.out.println("Sum of two numbers is :" + t.sum());
		t.sub();
        t.multiply();
        t.division();
	}

}
