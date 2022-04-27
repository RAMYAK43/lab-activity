import java.util.Scanner; 
class vote
{
public static void main (String[]args)
{
int age;
Scanner input=new Scanner(System.in);
System .out.println("enter ur age");
age=input.nextInt();
if(age>0)
{
System .out.println("eligible to vote");
}
else
{
System .out.println("not eligible to vote");
}
}
}