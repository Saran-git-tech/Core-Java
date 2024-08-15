package aug14.pack;

public class AutoBoxingAndUnBoxing {

	public static void main(String[] args) {
		
        int a = 57;
        boolean flag1 = true;
 //boxing and auto boxing   
        Integer i = Integer.valueOf(a); //boxing
        Integer j = a;  //auto boxing
        
        System.out.println("Before AutoBoxing : " + a + " " + "After AutoBoxing : "+i + " " +j);
        
        Boolean flag2 = flag1; //auto boxing
        
        System.out.println("Boolean AutoBoxing : "+flag2);
        
//unboxing        
        int unboxInt = i;     //unboxing
        boolean unboxBool = flag2; //unboxing
        
        System.out.println("Unboxing Int : "+ unboxInt);
        System.out.println("Unboxing Boolean : "+unboxBool);
        
       
		
        
        
        
	}

}
