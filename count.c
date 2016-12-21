#include<stdio.h>
#include<conio.h>
int dig(int n)
{
 static int count;
 n=n/10;
 count++;
 if(n!=0)
 dig(n);
 else
   return(count);
}
void main()
{
int n,a,count;
printf("\nEnter the digit");
scanf("%d",&n);
count=dig(n);

printf("\nthe count no of digit is %d",count);
}
