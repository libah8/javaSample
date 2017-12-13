package util;

import java.util.Arrays;

public class Array {

		public static int[] sort(int[] a){		
		int[] data = new int[a.length];
		System.arraycopy(a,0,data,0,a.length);
		//sort
		for(int i=0; i<data.length-1; i++){
			for(int j=i+1; j<data.length; ++j)
				if(data[i] > data[j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
		}
		return data;
	}
		
/**
 * 
 * @param a
 * @param descmode 
 * @return
 */
		public static int[] sort(int[] a, boolean descmode){		
		int[] data = new int[a.length];
		System.arraycopy(a,0,data,0,a.length);
		//sort
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; ++j)
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		}
		return data;
	}
	
	/*public static String[] sortString(String[] a){		
		String[] data = a;
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; ++j)
				if(a[i] > a[j]){
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		}
		return data;
	}*/
	//배열 출력 기능 추가
}
