package exceptionHandling;

public class exceptionExample {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		//divide(a,b);
		try {
			divide(a,b);
			
		}catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}
		
	}
	public static int divide(int a,int b) {
		int div =a/b;
		return div;
		
	}

}
