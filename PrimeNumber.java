package week1day1;

public class PrimeNumber {
	
	public static void main (String[] args) {
		
		int num =13;
		int c=0;
		
		
		for(int i=1;i<=num;i++)
		{
			if (num%i==0) {
				
				c++;
				}
			
		}
		if(c==2)
		{
			System.out.println("is Prime Number");
		}
		else
		{
			System.out.println("is not Prime Number");
		}
		
	}

}
