#include<stdio.h>
#include<conio.h>
int main()
{
int n,revno=0,rem=0;
printf("\enter an integer");
scanf("%d",&n);
while(n!=0)
{
rem=n%10;
revno=revno*10+rem;
n/=10;
}
printf("\n The reversed number is %d",revno);
}
