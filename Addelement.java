import java.util.*;
class Addelement
{
public static void main(String args[])
{
int a[]=new int[3];
int l=a.length;
Scanner s=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("enter the element to add in a array: ");
a[i]=s.nextInt();
}
int newarray[]=new int [l+1];
System.out.println("enter position with respect index: ");
int index=s.nextInt();
System.out.println("enter the  new element to add in a array: ");
int newelement=s.nextInt();
for(int i=0;i<l+1;i++)
{
if(i<index-1)
{
newarray[i]=a[i];
}
else if(i==index-1)
{
newarray[i]=newelement;
}
else
{
newarray[i]=a[i-1];
}
}
System.out.println("new list by add in a array: ");
for(int i=0;i<l+1;i++)
{
System.out.println(" "+newarray[i]);
}

System.out.println("before removing the element:"+Arrays.toString(a));
for(int i=1;i<a.length-1;i++)
a[i]=a[i+1];
System.out.println("After removing the element:"+Arrays.toString(a));
}
}

