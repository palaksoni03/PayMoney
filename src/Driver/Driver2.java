package Driver;

import java.util.Arrays;   
import java.util.Collections;
import java.util.Scanner;

public class Driver2 {
	 static int arraySize;

	    public static void main(String args[]){
	        System.out.println("Enter the size of currency denominations : :");
	        arraySize = new Scanner(System.in).nextInt();

	        int[] array =new int[arraySize];

	        System.out.println("Enter the currency denominations value one by one");
	        for(int i = 0; i< array.length ; i++){
	        	array[i] = new Scanner(System.in).nextInt();
	        }

	        int temp;
	        for(int i = 0 ; i < arraySize ; i++){
	            for(int j= i+1 ; j<arraySize ; j++ ){
	                if(array[i] < array[j]){
	                    temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }

	        System.out.println("Enter the amount you want to pay");

	        int amount = new Scanner(System.in).nextInt();

	        int[] noteCount = new int[arraySize];
	        for(int i = 0;i< arraySize;i++){
	            if(amount >= array[i]){
	            	noteCount[i] = amount / array[i];
	                amount = amount - noteCount[i] * array[i];
	            }
	        }

	        System.out.println("Your payment approach in order to give min no of notes will be");

	        for (int i = 0 ; i<arraySize ;i++){
	            if(noteCount[i] != 0){
	                System.out.println(array[i] + " : " + noteCount[i]);
	            }
	        }
	    }
	}
