package sample;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	int i,j;
	int n=s.nextInt();
	for(i=n; i>0; i--)
	{
	for(j=0; j<i; j++)
	{
	System.out.print("*");
	}
	System.out.print(" ");
	for(j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
	}
	}
}
