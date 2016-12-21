#include<stdio.h>
#include<conio.h>
void main()
{
    int n=0,temp=0,r=0,s=0;

    printf("\n enter the number");
    scanf("%d",&n);
    temp=n;
    while(n!=0)
    {

    r=n%10;
    s=s+(r*r*r);
    n/=10;
    }
     if(temp==s)
        printf("\n ARMSTRONG NUMBER");
     else
     printf("\n NOT AN ARMSTRONG NUMBER");
}
