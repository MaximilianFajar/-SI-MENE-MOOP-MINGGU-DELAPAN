package Tugas2;

public class MyClassPrime extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*
		int a = 3;
		int b;
		int c;
		
		System.out.println("First 10 prime");
		
		//System.out.println("2");
		
		for(b = 2; b <= 10;)
		{
			for(c = 2; c <= a - 1; c++)
			{
				if(a%c == 0)
					break;
			}
			if(c == a)
			{
				System.out.println(a + " ");
				b++;
			}
			a++;
		}
		
		System.out.println(" ");*/
		
		int a = 0;
		int b = 0;
		
		String bilPrima = "";
		
		System.out.println("10 Bilangan Prima");
		System.out.println(" ");
		
		for(a = 1; a <= 30; a++)
		{
			int c = 0;
			
			for(b = a; b >= 1; b = b -1)
			{
				if(a%b == 0)
				{
					c = c + 1;
				}
			}
			if(c == 2)
			{
				bilPrima = bilPrima + a + " ";
			}
		}
		System.out.println(bilPrima);
		
		System.out.println(" ");
	}

}
