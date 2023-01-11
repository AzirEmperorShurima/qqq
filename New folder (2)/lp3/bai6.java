package p2560;

import java.util.Scanner;

public class bai6 {
	double[] scores = new double[100];
	double sum = 0;
	double item;
    int count = 0;
    int Above = 0;
    int Below = 0;
    int plain = 0;
    
    void inPut() 
    {
    	Scanner sc = new Scanner(System.in);
        do {
        	System.out.print("Enter a new score: ");
        	item = sc.nextDouble();
        	if (item >= 0) 
        	{
        		scores[count] = item;
    	        sum += item;
    	        count++;
        	}
        } while (item >= 0);
    }
    
    void xuLi() 
    {
    	double average = sum / count;
    		    
        for (int i = 0; i < count; i++) 
        {
          if (scores[i] > average) 
          {
        	  Above++;
          } else if(scores[i] < average){
        	  Below++;
          } else {
        	  plain++;
          }
        }
    }
    
    void outPut() 
    {
    	System.out.println("Number of score above the average"
    								+ Above);
        System.out.println("Number of scores below the average " 
    								+ Below);
        System.out.println("Number of scores equal the average: " 
    								+ plain);
    }
    
	public static void main(String[] args) {
		bai6 b = new bai6();
		b.inPut();
		b.xuLi();
		b.outPut();
	}

}
