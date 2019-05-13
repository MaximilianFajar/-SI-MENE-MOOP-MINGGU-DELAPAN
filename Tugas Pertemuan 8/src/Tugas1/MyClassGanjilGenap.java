package Tugas1;

import java.util.Scanner;

public class MyClassGanjilGenap extends Thread{

	static int angka;
	
	Scanner scan = new Scanner(System.in);

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Masukan angka : ");
		angka = scan.nextInt(); scan.nextLine();
		
		if(angka %2 == 0)
		{
			System.out.println("Angka Genap");
		}
			
		else
		{
			System.out.println("Angka Ganjil");
		}
	}
}
