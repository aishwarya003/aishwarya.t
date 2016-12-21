#include<stdio.h>
#include<conio.h>
long int fact(int n);
void main()
{
int n;
printf("\nEnter the number");
scanf("%d",&n);
printf("\nFactorial of %d = %ld",n,fact(n));
}
long int fact(int n)
{
if(n>=1)
return n*fact(n-1);
else
return 1;
}

