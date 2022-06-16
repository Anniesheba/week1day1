package week1day1;

import java.util.Scanner;

public class FibonocciSeries {
	
	public static void main(String [] args) {
		
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int a=1;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
				
		}
		
		
	}

}
