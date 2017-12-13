package day5;

import java.util.Arrays;

public class P192 {

	public static void main(String[] args) {
		int[] src = {66, 77, 99, 56, 79, 78};
		System.out.println(Arrays.toString(src));
		
		int[] dest = new int[src.length*2];
		System.out.println(Arrays.toString(dest));
		
		System.arraycopy(src, 0, dest, src.length, src.length);
		System.out.println(Arrays.toString(dest));

	}

}
