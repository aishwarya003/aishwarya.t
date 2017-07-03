package lc4;

import java.util.Scanner;

public class ReverseTheString {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=s.next();
		String res="";
		s.close();
		for(int i=a.length()-1;i>=0;i--){
			res+=a.charAt(i);
		}
		System.out.println("The reversed string is :"+res);
	}
}
