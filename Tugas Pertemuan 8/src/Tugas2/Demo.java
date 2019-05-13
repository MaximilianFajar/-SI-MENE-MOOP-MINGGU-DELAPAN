package Tugas2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClassPrime prima = new MyClassPrime();
		MyClassFibonacci fibonacci = new MyClassFibonacci();
		
		prima.start();
		
		try 
		{
			Thread.sleep(60000);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		fibonacci.start();
	}

}
