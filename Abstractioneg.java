abstract class Operation
{
abstract  public void calculate();
public void show()
{
int add=30+10;
System.out.println("the addition of a and b is:"+add);
}
}
class Child extends Operation
{
public void calculate()
{
int sub=30-10;
System.out.println("the subtraction of a and b is:"+sub);
}
} 
class Child1 extends Child
{
public void show1()
{
int mul=2*3;
System.out.println("the multiplication of a and b is:"+mul);
}
} 
class Child2 extends Child1
{
public void show2()
{
int div=20/4;
System.out.println("the multiplication of a and b is:"+div);
}
} 
 class Abstractioneg
{
public static void main(String args[])
{

Child2 c2=new Child2();
c2.show();
c2.calculate();
c2.show1();
c2.show2();

}
}