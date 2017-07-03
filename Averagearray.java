package sample;

import java.util.Scanner;

public class Averagearray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of elements in array");
		int n=s.nextInt();
		int a[]=new int[n];
		int mid=n/2;
		//System.out.println(len1);
		int sum1=0;
		int sum2=0;
		float mean1;
		float mean2;
		System.out.println("Enter Values");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			
			if(i>=mid)
			sum1+=a[i];
			else
				sum2+=a[i];
		}
 


mean1=sum2/mid;
mean2=sum1/(n-mid);
if(mean1==mean2)
	System.out.println("Possible");
else
	System.out.println("Not Possible");
s.close();}
	
}
