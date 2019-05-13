package Tugas1;

public class MyClassFibonacci extends Thread{

	int f;
	int angka1 = 0;
	int angka2 = 1;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		do 
		{
			f = angka1 + angka2;
			angka1 = angka2;
			angka2 = f;
		} while (f < MyClassGanjilGenap.angka);
		
		if(f == MyClassGanjilGenap.angka)
		{
			System.out.println("Ini angka fibonacci");
		}
		else 
		{
			System.out.println("Ini bukan angka fibonacci");
		}
		
	}
	
	
}
