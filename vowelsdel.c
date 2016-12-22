#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char str[100];
int len,i,j,a,b;
printf("\nEnter a string:");
scanf("%s",&str);
len=strlen(str);
printf("\nThe reversed string %s",strrev(str));
for(i=0;i<len;i++)
{
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
    {
         for(j=i;j<len;j++)
         {

             str[j]=str[j+1];

         }
         len--;
    }

}
printf("\n%s",str);
getch();
}
