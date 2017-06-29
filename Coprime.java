package sample;
import java.util.Scanner;
public class Coprime {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int a , b ;
	System.out.println( "Enter two integers\n" ) ;
		a=s.nextInt();
		b=s.nextInt();
		s.close();
		if(gcf(a,b)==1)
		{
			System.out.println("The numbers are co primes");
		}
		else
		{
		System.out.println("The numbers are not co primes");
		}

		
	}
	 
	
	public static int gcf( int n , int m )
	{
		if( n == 0 || m == 0 )
			return 0 ;

		if( n < 0 ) 
			n = - n ;
		if( m < 0 ) 
			m = - m ;

		
		while( true ) 
			if( n > m )
				n -= m ;
			else if ( n < m )
				m -= n ;
			else
				break ;

		return n ;
	}
}
