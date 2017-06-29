package sample;

import java.util.Scanner;

public class ReturnOrderOfStrings {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String[] b=a.split(" ");
	String res="";
	for (int i = b.length - 1; i >= 0; i--) {
		res+= b[i]+" ";
	}
	System.out.println(res);
	s.close();
}
}

