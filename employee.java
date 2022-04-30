import java.util.Scanner;
class employee
{
String ename;
int eid;
double salary,DA,HRA,grosspay;
employee(String n,int m,double x)
{
ename=n;
eid=m;
salary=x;
}
void calculate()
{
DA=salary*15.0/100;
HRA=salary*10/100;
grosspay=salary+DA+HRA;
}
void disp()
{
System.out.println("DA IS="+DA);
System.out.println("HRA IS="+HRA);
System.out.println("grosspay="+grosspay);
}
public static void main(String[]args)
{
Scanner s= new Scanner(System.in);
System.out.println("enter ename=");
String ename = s.nextLine();
System.out.println("enter salary=");
double salary = s.nextDouble();
System.out.println("enter eid=");
int eid = s.nextInt();
employee in=new employee(ename,eid,salary);
in.calculate();
in.disp();
}
}