package com.java.test;

public class PyramidTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 5;
		for (int i = count; i >= 1; i--) {
		  int tempCount = 0;
		  int j = count - i + 1;
		  while (tempCount != i) {
		    if (j % 2 != 0) {
		      if (!(i % 2 == 0 && tempCount >= i - 1)) {
		    	  System.out.print(j);
		      }
		      tempCount++;
		    } else {
		    	System.out.print("_");
		    }
		    j++;
		  }
		  System.out.println("");
		}


	}
}

