package ww222ag_assign3.exercise2;

import java.io.File;
import java.util.Scanner;

public class PrintJavaMain {
	//
	private static int depth=1, count=0;

	private static void visitSub(File file){
		
		if(file.isDirectory()){
			printAllJavaFiles(file);
			depth++;
			File [] subs=file.listFiles();
			for(File f :subs)
				visitSub(f);
			depth--;
		}
		else if(file.exists()==false){
			System.err.println("Wrong Path! Please type in the right path of the file");
		}
		else
		{
			printAllJavaFiles(file);
		}
				
	}
	
	private static void printAllJavaFiles(File directory){
		
		StringBuffer buf=new StringBuffer();
		
		for(int i=0;i<depth;i++)
		{
			buf.append(" ");
		}
		//    D:/JAVA
		String filename=directory.getName();
		String prefix=filename.substring(filename.lastIndexOf(".")+1);
		//System.out.println(prefix);
		
		if(prefix.equals("java"))
		{
			System.out.println((++count)+buf.toString()+directory.getName()+" "+directory.length()+" Byte");
		}
		//System.out.println((++count)+buf.toString()+directory.getName());
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Please type in the Directory of Java Files: ");
		
        Scanner scan=new Scanner(System.in);
		
		String str=scan.nextLine();
		
		scan.close();
		
		File startDir = new File(str);
		visitSub(startDir);

	}
}
//output like this : 38      EuclideanMain.java 162 Byte