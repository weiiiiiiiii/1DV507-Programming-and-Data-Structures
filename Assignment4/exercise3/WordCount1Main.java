package ww222ag_assign4.exercise3;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordCount1Main {
	
   private static String readFile(String path) throws IOException{
		
		StringBuilder text=new StringBuilder();
		
		Scanner scan=new Scanner(new File(path));
		
		while(scan.hasNext())
			text.append(scan.nextLine()+"\n");
		
		scan.close();
		return text.toString();
		
		
	}

	public static void main(String[] args) {
		
		String text=null;
		try{
			text = readFile("words.txt");
			
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		
		StringTokenizer token=new StringTokenizer(text);
		HashSet<Word> hash=new HashSet<Word>();
		TreeSet<Word> tree=new TreeSet<Word>();
		while(token.hasMoreTokens())
		{
			
			Word sth=new Word(token.nextToken());
			hash.add(sth);
			tree.add(sth);
			
		}
		
		System.out.println(hash.size()+" "+tree.size());
		System.out.println(hash.toString());
		System.out.println(tree.toString());
		
		Iterator<Word> test=tree.iterator();
		
		while(test.hasNext())
		{
			System.out.println(test.next());
			
		}
		

	}

}
