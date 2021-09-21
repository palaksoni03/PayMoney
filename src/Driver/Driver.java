package Driver;

import java.util.Scanner;

public class Driver {
	   public static void main(String args[]) {
		   	  int TargetNo, TargetValue, TransactionNo, checkValue=0;
		      System.out.println("Enter the size of transaction array :: ");
		      Scanner s = new Scanner(System.in);
		      int size = s.nextInt();
		      int myArray[] = new int [size];
		      System.out.println("Enter the values of array one by one");
		 
		      for(int i = 0; i<size; i++) {
		         myArray[i] = s.nextInt();
		     }
		     
		      System.out.println("Enter the total no of targets that needs to be achieved");
		      TargetNo = s.nextInt();
		      
		      System.out.println("Enter the value of target");
		      TargetValue = s.nextInt();
		      
		      for(int i = 0; i<TargetNo; i++) {
		    	  checkValue = checkValue + myArray[i];
		    	  TransactionNo = i+1;
			         if(TargetValue<=checkValue) {
			        	 System.out.println("Target achieved after "+TransactionNo+" transactions");
			         }else {   
					     System.out.println("The target is not achieved");
			         }
			  }		      
		     
		   }
		}
