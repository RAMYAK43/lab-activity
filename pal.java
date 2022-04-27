class pal
{
public static void main (String[]args)
{
int num=121,sum=0,rem;
int temp=num;//usig temp to store num
while(num>0)
{
rem=num%10;
sum=(sum*10)+rem;
num=num/10;
}
if(temp==sum)
{
System.out.println(temp+"pal");
}
else
{
System.out.println(temp+"pal not");
}
}
}



