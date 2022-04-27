import java.util.Scanner;
class math
{
public static void main(String[]args)
{
int x,y,z,add,sub; 
double div; 
Scanner ram= new Scanner(System.in);
System.out.println("first number=");
x=ram.nextInt();
System.out.println("second number=");
y=ram.nextInt();
System.out.println("third number=");
z=ram.nextInt();
System.out.println("\nARITHMETIC OPERATION");
System.out.println("\naddition="+(x+y));
System.out.println("\nsubtraction="+(x-y));
System.out.println("\nmultipication="+(x*y));
System.out.println("\ndivition="+(x/y));
System.out.println("\nmodulus="+(x%y));
System.out.println("\nRELATIONAL OPERATION");
System.out.println(x == y);  //false
System.out.println(x != y); //true
System.out.println(x > y);  //true
System.out.println(x < y); //false
System.out.println(x >= y); //true
System.out.println(x <= y);
System.out.println("\nSIMPLE LOOP");
for( int i=5;i<=10;i++)
{
System.out.println(i);
}
System.out.println("\nENHANCED LOOP");
{
int v[]={2,3,4,5};
int sum=0;
for(int r:v)
{
sum+=r;
System.out.println(r);
}
}
}
}