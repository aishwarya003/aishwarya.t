#include<stdio.h>
#include<conio.h>
int main()
{
int n,rem=0,sum=0,temp;
scanf("%d",&n);
temp=n;1
while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(temp==sum)
printf("%d is Armstrong",temp);

else
    printf("%d is not an armstrong number",temp);

return 0;
}
