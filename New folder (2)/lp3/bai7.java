package p2560;

import java.util.Scanner;

public class bai7 {
	int[] inputList = new int [10]; 
    int[] distinctArray = new int [10];
    int counter = 0; 
    
    void input() 
    {
    	Scanner sc = new Scanner (System.in);
    	int num; 
    	System.out.println("Please enter in 10 integers: ");
    	for (int i = 0; i < inputList.length; i++)
        {
            num = sc.nextInt(); 
            inputList[i] = num; 
        }
    }
	
    void processing() 
    {
    	for (int i = 0; i < inputList.length; i++)
         {
             boolean found = false;
             for (int j = 0; j < counter; j++)
             {
                 if (inputList[i] == distinctArray[j])
                 {
                     found = true;
                     break;
                 }
             }
             if (!found)
             {
                 distinctArray[counter++] = inputList[i];
             }
         }
    }
    
    void output() 
    {
    	System.out.println("The number of distinct numbers is " + counter);
        System.out.print("The distict numbers are: ");
        for (int x=0; x<counter; x++)
        {
            System.out.print(distinctArray[x] + " ");
        }
    }
    
	public static void main(String[] args) {   
		bai7 b = new bai7();
		b.input();
		b.processing();
		b.output();
	}

}
