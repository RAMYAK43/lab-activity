import java.util.Scanner;
class mobike
{
int bno;
int days;
int charge;
String name;
void input()
{
Scanner in = new Scanner(System.in);
System.out.print("Enter bike Name: ");
name = in.nextLine();
System.out.print("Enter bike Number: ");
bno = in.nextInt();
System.out.print("Enter Number of Days: ");
days = in.nextInt();
}
void compute() 
{
if (days <= 5)
charge = days * 500;
else if (days <= 10)
charge = (5 * 500) + ((days - 5) * 400);
else
charge = (5 * 500) + (5 * 400) + ((days - 10) * 200);
}
void display() {

System.out.println("bike charge is ="+charge);
}
public static void main(String args[]) 
{
mobike obj = new mobike();
        obj.input();
        obj.compute();
        obj.display();
    }
}