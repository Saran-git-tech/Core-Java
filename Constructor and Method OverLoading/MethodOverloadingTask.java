package aug9.pack;

class Helper{
	
	public int add(int num1,int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	
	public double add(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}
	
	
}

public class MethodOverloadingTask {
    public static void main(String[] args)
    {
      Helper H = new Helper();
      System.out.println("sum of Integer : " + H.add(2,4));
      System.out.println("sum of Double : " + H.add(10.5,20.5));
    }
}
