import java.util.Scanner;
import java.util.Scanner;
class employee2
{
String empname;
double salary;
Scanner vr=new Scanner(System.in);
}
class permanentemp extends employee2
{
double hike=0.5;
void show()
{
System.out.println("ur name");
String empname=vr.nextLine();
System.out.println("ur salary");
double salary=vr.nextDouble();
System.out.println("permanetemployee hike is"+( salary + ( salary * hike )));
}
}
class temporaryemp extends employee2
{
double hike=0.3;
void show1()
{
System.out.println("ur name");
String empname=vr.nextLine();
System.out.println("ur salary");
double salary=vr.nextDouble();
System.out.println("tempararyemployee hike is"+(salary + (salary * hike )));
}
}
class textemp
{
public static void main(String[]args)
{
int n;
permanentemp p=new permanentemp();
temporaryemp t=new temporaryemp();
Scanner rv=new Scanner(System.in);
System.out.println("r u permanet empyee if yes =1 or no=0");
n=rv.nextInt();
if(n>=1)
{
p.show();
}
else
{
t.show1();
}
}
}
