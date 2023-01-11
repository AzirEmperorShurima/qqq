package bt;

import java.util.Arrays;

public class mang {
	public static int[] revert(int[] k) {
		int[] moi = new int[k.length];
		for(int i=k.length-1; i>=0; i--) {
			moi[k.length-i-1] = k[i];
		}
		return moi;
	}
	public static void main(String[] args) {
		int[] a = {126, 165, 95, 0, 21, 18, 45};
		a = revert(a);
		System.out.println(Arrays.toString(a));
	}

}
