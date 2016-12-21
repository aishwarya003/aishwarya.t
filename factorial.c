#include<stdio.h>
#include<conio.h>
long int fact(int n);
void main()
{
int n;

scanf("%d",&n);
printf("\n%ld",fact(n));
}
long int fact(int n)
{
if(n>=1)
return n*fact(n-1);
else
return 1;
}

