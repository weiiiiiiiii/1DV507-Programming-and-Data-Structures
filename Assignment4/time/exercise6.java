package ww222ag_assign4.time;

public class exercise6 {

	public static void main(String[] args) {
		
		
		String testShort = "a";
		String testLong="";
		for(int i=0;i<80;i++)
		{
			testLong=testLong+"a";
		}
		
		
		
		
		
		int result1=0;
		for(int i=0;i<5;i++)
		{
			int count=0;
			String test="";
			long before = System.nanoTime();
			while(true){
				
				test=test+testShort;
				count++;
				long after = System.nanoTime();
				long estimatedTime = after-before;
				if(estimatedTime>=10E9)
				{
					break;
				}
			}
			result1=result1+count;
			
		}
		
		System.out.println("Concatenating short strings: "+result1/5);
		
		
		int result2=0;
		for(int i=0;i<5;i++)
		{
			int count=0;
			String test="";
			long before = System.nanoTime();
			while(true){
				
				test=test+testLong;
				count++;
				long after = System.nanoTime();
				long estimatedTime = after-before;
				if(estimatedTime>=10E9)
				{
					break;
				}
			}
			result2=result2+count;
			
		}
		
		System.out.println("Concatenating long strings: "+result2/5);
		
		
		int result3=0;
		for(int i=0;i<5;i++)
		{
			int count=0;
			StringBuilder test=new StringBuilder();
			long before = System.nanoTime();
			while(true){
				
				test.append(testShort);
				count++;
				test.toString();
				long after = System.nanoTime();
				long estimatedTime = after-before;
				if(estimatedTime>=10E9)
				{
					break;
				}
			}
			result3=result3+count;
			
		}
		
		System.out.println("Appending short strings: "+result3/5);
		
		int result4=0;
		for(int i=0;i<5;i++)
		{
			int count=0;
			StringBuilder test=new StringBuilder();
			long before = System.nanoTime();
			while(true){
				
				test.append(testLong);
				count++;
				test.toString();
				long after = System.nanoTime();
				long estimatedTime = after-before;
				if(estimatedTime>=10E9)
				{
					break;
				}
			}
			result4=result4+count;
			
		}
		
		System.out.println("Appending long strings: "+result4/5);
		

	}

}
