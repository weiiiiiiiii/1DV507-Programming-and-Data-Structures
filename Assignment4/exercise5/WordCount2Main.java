package ww222ag_assign4.exercise5;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount2Main {

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
		WordSet tree=new TreeWordSet();
		WordSet hash=new HashWordSet();
		
//		Word a=new Word("12");
//		Word b=new Word("28");
//		Word c=new Word("108");
//		Word d=new Word("140");
//		
//		tree.add(a);
//		tree.add(b);
//		tree.add(c);
//		tree.add(d);
//		System.out.println(tree.size());
//		System.out.println(tree.toString());
//		System.out.println(tree.contains(d));
		
//		Iterator test=hash.iterator();
//		
//		while(test.hasNext())
//		{
//			System.out.println(test.next());
//		}
		
		
//		
		while(token.hasMoreTokens())
		{
			
			Word sth=new Word(token.nextToken());
			hash.add(sth);
			tree.add(sth);
			
			
		}
		
		System.out.println(tree.size());
		System.out.println(tree.toString());
		System.out.println(hash.size());
		System.out.println(hash.toString());
		
		Iterator<Word> treetest=tree.iterator();
		
		while(treetest.hasNext())
		{
			System.out.println(treetest.next());
		}
		
		System.out.println(hash.toString());
		
		Iterator<Word> hashtest=hash.iterator();
		
		while(hashtest.hasNext())
		{
			System.out.println(hashtest.next());
		}
		
		
		
	}

}
