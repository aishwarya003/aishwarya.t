package sample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		int count =0;
		int d=0;
		int i;
		int res;
		for(i=num;i>0;i=i/10){
			count++;
		}
		for(i=num;i>0;){
			 res=i%10;
			d=d+(int)(Math.pow(10, count-1)*res);
			count--;
			i=i/10;
		}
		if(num==d){
			System.out.println("The number is palindrome");
		}
		else{
			System.out.println("The number is not a palindrome");
		}
	}

}
