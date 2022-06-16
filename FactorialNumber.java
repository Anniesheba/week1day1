

package week1day1;
import java.util.*;

public class FactorialNumber { 
	
	public static void main(String[] args){
		
		int n=5;
		int fact=1;
		
		//System.out.println("Enter the number");
		//Scanner sc = new Scanner(System.in);
		//n= sc.nextInt();
		 
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of the "+n+" is "+fact);
	
	} 
	

}
