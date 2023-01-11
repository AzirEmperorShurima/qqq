package p2560;

import java.util.Scanner;

public class bai4 {
	String s;
	
	void inPut() 
	{
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
	}
	
	String remove() 
	{
		String r;
		r = s.replaceAll("\\s", "");
		return r;
	}
	
	String reserve()
	{
		String rev = new StringBuffer(s).reverse().toString();
		return rev;
	}
	
	void lengthDK() 
	{
		if(s.length() > 3)
		{
			for(int i = 0; i < s.length(); i++)
			{
				if(i == 3)
					System.out.println(s.charAt(i));
			}
		}
		else 
		{
			System.out.println("N/A");
		}
	}
	
	void countCharacterType(String s)
	{
		int vowels = 0;
		int consonant = 0;
		int special = 0;
		int numeral = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if((ch >= 'a' && ch <= 'z') ||
				(ch >= 'A' && ch <= 'Z'))
			{
				ch = Character.toLowerCase(ch);
				if(ch == 'a' || ch == 'e' || ch == 'i'|| 
						ch == 'u' || ch == 'o')
					vowels++;
				else 
					consonant++;
			}
			else if(ch >= '0' && ch <= '9')
				numeral++;
			else
				special++;
		}
		System.out.println("Vowels: " 			 + vowels);
        System.out.println("Consonant: " 		 + consonant);
        System.out.println("Digit: " 			 + numeral);
        System.out.println("Special Character: " + special);
	}
	
	int countWords(String str)
	{
      if (str == null || str.isEmpty())
          return 0;

      String[] words = str.split("\\s+");

      return words.length;
	}
	
	void lower(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			ch = Character.toLowerCase(ch);
			System.out.print(ch);
		}
	}
	
	void upper(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			ch = Character.toUpperCase(ch);
			System.out.print(ch);
		}
	}
	
	void replace(String s)
	{
		String result="";
		String str;
		char[] array = s.toCharArray();
		for(int i = 0; i < s.length(); i++)
		{
			if((i != (s.length() - 1)))
			{
				if(array[i] == array[i+1])
					str = s.trim();
				else
					result += array[i];
			}
			else 
			{
				result += array[i];
			}
		}
		System.out.println(result);
	}
	
	void onlyOneSpace(String s)
	{
	    System.out.println(s.replaceAll("\\s+", " ").trim());
	}
	
	void word(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			//co phai la chu cai hay khong
			if(Character.isLetter(s.charAt(i)))
				count++;
		}
		System.out.println("Letter: " + count);
	}
	
	
	public static String convert(String s) 
	{
		StringBuilder titleCase = new StringBuilder(s.length());
	    boolean nextTitleCase = true;
	    
	    for (char c : s.toCharArray()) 
	    {
	        if (Character.isSpaceChar(c)) 
	        {
	            nextTitleCase = true;
	        } 
	        else if (nextTitleCase) 
	        {
	            c = Character.toTitleCase(c);
	            nextTitleCase = false;
	        }
	        titleCase.append(c);
	    }
	    return titleCase.toString();
	}
	
	void EnglishNameLike() 
	{
		s = s.trim();
		System.out.print(s.substring(s.lastIndexOf(' ')+1) + " ");
		System.out.print(s.substring(0, s.lastIndexOf(' ')+1));
	}
	
	 public static String swap(String str, int i, int j)
	    {
	        char ch[] = str.toCharArray();
	        char temp = ch[i];
	        ch[i] = ch[j];
	        ch[j] = temp;
	        return new String(ch);
	    }
	 
	    public static String reverseWord(String s)
	    {
	        int left = 0, i = 0, n = s.length();
	 
	        while (s.charAt(i) == ' ')
	            i++;
	 
	        left = i;
	 
	        while (i < n) {
	            if (i + 1 == n || s.charAt(i) == ' ') 
	            {
	                int j = i - 1;
	                if (i + 1 == n)
	                    j++;
	 
	                while (left < j)
	                    s = swap(s, left++, j--);
	 
	                left = i + 1;
	            }
	            if (i > left && s.charAt(left) == ' ')
	                left = i;
	 
	            i++;
	        }
	        s = new StringBuilder(s).reverse().toString();
	        return s;
	    }
	
	public static void main(String[] args) {
	bai4 b = new bai4();
	b.inPut();
	
//	System.out.println(b.remove());
	
//	System.out.println(b.reserve());
	
//	b.lengthDK();
	
//	b.countCharacterType(b.s);
	
	System.out.println("No of words: "  + b.countWords(b.s));
	
//	b.lower(b.s);
	
//	b.upper(b.s);
	
//	b.replace(b.s);
	
//	b.onlyOneSpace(b.s);
	
//	b.word(b.s);
	
//	System.out.println(b.convert(b.s));
	
//	b.EnglishNameLike();
	
//	System.out.println(b.reverseWord(b.s));
	
	}
}
