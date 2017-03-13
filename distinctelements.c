#include<stdio.h>
int elements(int arr[],int len)
{
    int counted[len],j,n,count,flag;
    counted[0]=arr[0];
    count=1;
    for(j=0;j<=len-1;j++)
    {
        flag=1;
        for(n=0;n<count;n++)
        {
            if(arr[j]==counted[n])
            {
                flag=0;
            }
        }
    if(flag==1)
    {
        ++count;
        counted[count-1]=arr[j];
    }
    }

return count;
}

int main(void)
{
    int s,i;
    int arr[100];
    scanf("%d",&s);
    for(i=0;i<s;i++)
    {
    scanf("%d",&arr[i]);
    }

printf("%d",elements(arr,i));
return 0;
}
