package aug7;
 
 abstract class Animal{
	 
	 abstract void sound();
 }

 
 class Lion extends Animal{
	 void sound() {
		 System.out.println("grrauuu!!!");
	 }
 }

 class Tiger extends Animal{
	 
	 void sound() {
		 System.out.println("raawuurr!!!");
	 }
 }


public class AbstractionTask {
        
	public static void main(String[] args) {
		
		Animal obj1 = new Tiger();
		obj1.sound();
		
		Animal obj2 = new Lion();
		obj2.sound();
		
	
	}
}
