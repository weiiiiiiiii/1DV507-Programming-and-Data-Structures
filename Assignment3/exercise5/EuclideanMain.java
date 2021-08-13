package ww222ag_assign3.exercise5;

//
import java.util.Scanner;

public class EuclideanMain  {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Please input the first number: ");
		
		int first=scan.nextInt();
		
		System.out.print("Please input the second number: ");
		
		int second=scan.nextInt();
		
		System.out.println("GCD("+first+","+second+") = "+gcd(first,second));
		
		scan.close();
		

	}
	
	
	private static int gcd(int m,int n){
		
		if(n==0)
			return m;
		else
			return gcd(n,m%n);
		
		
	}

}
