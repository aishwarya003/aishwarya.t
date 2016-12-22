#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,*p,*q,sum;
printf("\nEnter the first no");
scanf("%d",&a);
printf("\n Enter the second no");
scanf("%d",&b);
p=&a;
q=&b;
sum=*p+*q;
printf("\nthe sum is %d",sum);
}
