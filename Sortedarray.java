package programsguvi;
import java.util.Scanner;
public class Sortedarray {

	 public static void main(String[] args){
			Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		int[] a=new int[n];
		int cnt=0;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for( i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
			
				cnt++;
			}
		}
		if(cnt==a.length-1)
		{
			System.out.println("Sorted Order");
		}
		else
		{
			System.out.println("Unsorted Order");
		}
		s.close();

	}

	
	 
 }

