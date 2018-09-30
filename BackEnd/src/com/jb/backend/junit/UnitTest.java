package com.jb.backend.junit;

import java.awt.List;
import java.util.ArrayList;

/**
*@author Andy YE
*@date 2018年8月31日下午3:53:27

*/

public class UnitTest {
//	static int arrTest[] = {0,1,0,6,9,0,7,0,2};
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	UnitTest ut = new UnitTest();
//	System.out.println(ut.getLength(arrTest));
//	System.out.println(ut.getArray(arrTest));
//	
//	}
//	public int getLength(int arr[]) {
//		int length = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] ==0) continue;
//			length++;
//		}
//		return length;
//		
//	}
//	
//	public int[] getArray(int arr[]){
//		int arr2[] = arr.clone();
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < arr2.length; i++) {
//			if(arr2[i]!=0) list.add(arr2[i]);
//		}
//		Object[] finalArr = list.toArray();
//		System.out.println(finalArr);
//		
//		return null;
//	}
//	public void printArr(int arr[]) {
//		for(int i=0;i<=arr.length;i++) {
//			System.out.print(arr[i] + ' ');
//		}
//	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}


