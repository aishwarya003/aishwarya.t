#include<stdio.h>
#include<conio.h>
int main()
{
int n,rn=0,rem;
printf("\nEnter a number");
scanf("%d",&n);
while(n!=0)
{
rem=n%10;
rn=rn*10+rem;
n/=10;
}
printf("\n%d",rn);
return 0;
}
