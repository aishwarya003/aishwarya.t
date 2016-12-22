#include<stdio.h>
#include<conio.h>
#include<ctype.h>
void main()
{
char str;
printf("\nEnter the character");
scanf("%c",&str);
if(isalpha(str))
 printf("\nfalse");
else
 printf("\nTrue");
}
