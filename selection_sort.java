package selectionsort;

import java.util.Random;
import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
System.out.println("enter the size of the array");
int size=userInput.nextInt();
int array[]=new int[size];
Random random=new Random();
System.out.println("populating array with random numbers");
for(int i=0;i<size;i++) {
	array[i]=random.nextInt();
	}
	System.out.println("original array");
	for(int  i=0;i<size;i++) {
		System.out.println(array[i]+" ");
	}
	System.out.println("performing selection sort");
	long startTime=System.currentTimeMillis();
	selection(array);
	long endTime=System.currentTimeMillis();
	long executionTime=endTime-startTime;
	
	System.out.println("sorted array");
	for(int num:array) {
		System.out.println( num+" ");
	}
	System.out.println("Total time of execution is"+executionTime+"milliseconds");

	}

public static void selection(int[]array) {
	int n=array.length;
	for(int i=0;i<n;i++) {
	int	minIndex=i;
	for(int j=i+1;j<n;j++) {
		if(array[j]<array[minIndex]) {
			minIndex=j;
		}
	}
int temp=array[minIndex];
array[minIndex]=array[i];
array[i]=temp;


}
}
}
