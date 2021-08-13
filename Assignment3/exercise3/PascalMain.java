package ww222ag_assign3.exercise3;

import java.util.Scanner;
public class PascalMain {
	public PascalMain(){
		
//		
	}
	
	
	public static int[] pascalRow(int n){
		
		int[] array=new int[n+1];
		
		array[0]=1;
		array[array.length-1]=1;	
		if(n>1)
		{
			for(int i=1;i<array.length-1;i++){
			
			array[i]=pascalRow(n-1)[i-1]+pascalRow(n-1)[i];
			
		}	
			
		}
			
		return array;
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("Please the row of Pascal’s Triangle: ");
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		scan.close();
		
		System.out.println("The line "+n+" includes the number: ");
		
		for(int i=0;i<pascalRow(n).length;i++){
			
			
			System.out.print(pascalRow(n)[i]+" ");
			
			
		}
		
		
		
		
		
	}
	

}
