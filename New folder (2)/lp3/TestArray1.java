package bt;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray1 {
	public static int[] add(int[] first, int[] second) {
		int length= first.length < second.length ? 
				first.length : second.length;
		
		int[] result = new int[length];
		
		for(int i=0; i<length; i++) {
			result[i] = first[i] + second[i];
		}
		return result;
		
	}
	
	public static int[] only_in_m1(int[] first, int[] second) {
//		int length = 0;
//		for(int i=0; i<first.length; i++) {
//			for(int j=0; j<second.length; j++) {
//				if(first[i] == second[j]) {
//					break;
//				}else if(j == second.length-1){
//					length++;
//				}
//			}
//		}
		
		int[] result = new int[first.length];
				
		for(int i=0; i<first.length; i++) {
			for(int j=0; j<second.length; j++) {
				if(first[i] == second[j]) {
					break;
				}else if(j == second.length-1){
					result[i] = first[i];
				}
			}
		}
		return result;
	}
	
	public static int[] only_in_m2(int[] first, int[] second) {		
		int[] result = new int[second.length];
				
		for(int i=0; i<second.length; i++) {
			for(int j=0; j<first.length; j++) {
				if(second[i] == first[j]) {
					break;
				}else if(j == first.length-1) {
					result[i] = second[i];
				}
			}
		}
		return result;
	}
	
	public static void Giao_m1_m2(int[] first, int[] second) {	
		int length = first.length < second.length ? first.length : second.length;
		
		System.out.print("m1 Giao m2:");
        System.out.println();
		int[] result = new int[length];
	        for (int i = 0; i < first.length; i++) {
	            for (int j = 0; j < second.length; j++) {
	            	if (first[i] == second[j])
	            		 System.out.print(first[i] + " ");
	            }
	        }
	    }
	
	 public static void printIntersect(int[] A, int[] B, int n, int m) {
	        int[] R = new int[n + m];
	        int index = 0;
	        // Lấy những phần tử trong A mà chưa có trong R
	        for (int i = 0; i < n; i++) {
	            if (!isPresent(R, index, A[i])) {
	                R[index] = A[i];
	                index++;
	            }
	        }

	        // Lấy những phần tử trong B  mà chưa có trong R
	        for (int i = 0; i < m; i++) {
	            if (!isPresent(R, index, B[i])) {
	                R[index] = B[i];
	                index++;
	            }
	        }

	        // Sắp xếp mảng
	        Arrays.sort(R, 0, index);
	        for(int i = 0; i < index; i++){
	            System.out.print(R[i] + " ");
	        }

	    }

	    public static boolean isPresent(int[] arr, int n, int x) {
	        for (int i = 0; i < n; i++)
	            if (arr[i] == x)
	                return true;
	        return false;
	    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mang thu nhat: " );
		int d1 = sc.nextInt();
		int[] m1 = new int[d1];

		for(int i=0; i<m1.length; i++) {
			m1[i] = sc.nextInt();
		}
		
		System.out.println("Nhap mang thu hai: " );
		int d2 = sc.nextInt();
		int[] m2 = new int[d2];
		
		for(int i=0; i<m2.length; i++) {
			m2[i] = sc.nextInt();
		}
		
//		int[] m3 = add(m1, m2);
//		System.out.println("Tong m1 + m2 = " + Arrays.toString(m3));
//		
//		System.out.println();
//		
//		Arrays.sort(m1);
//		System.out.print("Mang m1 tang dan" + Arrays.toString(m1));
//		
//		System.out.println();
//		
//		Arrays.sort(m3);
//		System.out.print("Mang m3 tang dan" + Arrays.toString(m3));
		
//		int[] m4 =only_in_m1(m1, m2);
//		System.out.println("m3 = m1 \\ m2 = " + Arrays.toString(m4));

//		int[] m5 =only_in_m2(m1, m2);
//		System.out.println("m3 = m2 \\ m1 = " + Arrays.toString(m5));
		
//		Giao_m1_m2(m1, m2);
		
		printIntersect(m1, m2, m1.length, m2.length);
	}
	

}
