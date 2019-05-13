package Tugas1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClassGanjilGenap gage = new MyClassGanjilGenap();
		
		MyClassFibonacci fibonacci = new MyClassFibonacci();
		
		gage.start();
		
		try 
		{
			Thread.sleep(30000);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		fibonacci.start();
	}

}
