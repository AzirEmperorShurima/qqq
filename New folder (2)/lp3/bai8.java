package p2560;

public class bai8 {
	int[] count = new int[100];
	void count1() 
	{
		int num;
	    for(int i=0; i<100; i++)
	    {
	           num = (int) (Math.random() * 10);
	           count[i] = num;
	     }
	}
	
	void output() 
	{
		for(int i=0; i<100; i++)
	    {
	    	System.out.println("Count of "+ (i+1) 
	    			+" is "+ count[i]);
	    }
	}
	
public static void main(String[] args) {
	bai8 b = new bai8();
	b.count1();
	b.output();
   }
}
