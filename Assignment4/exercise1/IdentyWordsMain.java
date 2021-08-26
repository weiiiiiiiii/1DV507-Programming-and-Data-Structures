package ww222ag_assign4.exercise1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IdentyWordsMain {

	 private static String readFile(String path) throws IOException{
			
			StringBuilder text=new StringBuilder();
			
			Scanner scan=new Scanner(new File(path));
			
			while(scan.hasNext())
				text.append(scan.nextLine()+"\n");
			
			scan.close();
			return text.toString();
			
			
		}
		
	    private static String input(){
			
			Scanner input=new Scanner(System.in);
			
			System.out.print("Please type in the file address: ");   //  D:/JAVA/1DV507/src/ww222ag_assign4/exercise1/HistoryOfProgramming.txt

			
			

			String str= input.nextLine();
			
			input.close();
			
			return str;
			
			
		}
		
		
		public static void main(String[] args) throws IOException {
			
			String text="";
			try{
				text = readFile(input());
				
				
			}catch(IOException e){
				
				e.printStackTrace();
				
			}
			
			StringBuffer builder=new StringBuffer();
			
			for(int i=0;i<text.length();i++)
			{
				if(Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i)))
				{
					builder.append(text.charAt(i));
				}
				else
				{
					builder.append(" ");
					
				}
				
				
			}
			
			File outFile = new File("words.txt");
			PrintWriter printer= new PrintWriter(outFile);
			printer.print(builder);
			printer.close();
			
			

	}

}
