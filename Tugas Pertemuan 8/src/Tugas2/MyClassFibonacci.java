package Tugas2;

public class MyClassFibonacci extends Thread{

	int f;
	int angka1 = 0;
	int angka2 = 1;
	
	String bilFibonacci = "";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("20 Bilangan Fibonacci");
		System.out.println(" ");
		
		System.out.println(angka1 + " ");
		System.out.println(angka2 + " ");
		
		for (int i = 1; i <= 18; i++) 
		{
			f = angka1 + angka2;
			angka1 = angka2;
			angka2 = f;
			
			//System.out.println(f + " ");
			bilFibonacci = bilFibonacci + f + " ";
			
			System.out.println(bilFibonacci);
		}
	}
	
	
}
