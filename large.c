#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("\nEnter the three numbers");
scanf("%d%d%d",&a,&b,&c);

if((a>b)&&(a>c))
printf("\nA is greater");
else if(b>c)
printf("\n B is greater");
else
printf("\n C is greater");
getch();
}
