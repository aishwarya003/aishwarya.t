package sample;

import java.util.Scanner;

public class StringContainsSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a;
		String b;
		System.out.println("Enter two strings");
		a=s.next();
		b=s.next();
		s.close();
		for(int i=0;i<=a.length()-2;i++){
			String sa=a.substring(i,i+2);
			if(b.contains(sa)){
				System.out.println("True");
				break;
			}
			else{
				System.out.println("False");
			}
		}

}
}
