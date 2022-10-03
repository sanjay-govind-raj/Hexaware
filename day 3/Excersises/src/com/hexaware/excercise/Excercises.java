package com.hexaware.excercise;
import java.util.Arrays;
import java.util.Scanner;


public class Excercises {

	public static void main(String[] args) {
//		Q1
		
		int[] A ={23,12,45,67,90,23,54,67,8,1,14};
		
		Arrays.sort(A);
		for(int i = 0; i < A.length; i++) {
			System.out.print(" " + A[i]);
		}
		
//		Q2
		
		int flag= 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] == 65) {
				System.out.println("\nFound 65 at position " + i);
				flag = 1;
			}
			
		}
		if (flag ==0) {
			System.out.println("\n65 Not Found");
		}
		
//		Q3
		Scanner sc =new Scanner(System.in);
		
		System.out.println("\nEnter element to be searched");
		int ele = sc.nextInt();
		flag =0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] == ele) {
				System.out.println("\nFound "+ele +"at position " + i);
				flag = 1;
			}
			
		}
		if (flag ==0) {
			System.out.println("\n "+ele+"Not Found");
		}
		
		

		
	



//  Q4.
		int [] array = new int [] {23,12,45,67,90,23,54,67,8,1,14};  
		 int d=65; 
		 
		for (int k = 0; k < array.length; k++) {
		      if (d == array[k]) {
		        System.out.println(k);
		        return;
		      }
		    }
		    System.out.println(-1);
		    System.out.println("Index position of 5 is: "
	                + array[4]);
		    int Index_position = 7;
		    int newValue    = 45;

		   System.out.println("Original Array : "+Arrays.toString(array));     
		    
		   for(int p=array.length-1; p > Index_position; p--)
		   {
		     array[p]= array[p-1];
		    }
		    array[Index_position] = newValue;
		    System.out.println("New Array: "+Arrays.toString(array));
		}
	}
	  
		  




    
    

  
