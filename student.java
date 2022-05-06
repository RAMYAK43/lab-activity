class student
{
String stuname;
int rollno;
static String clgname="gsbt";
static void change()
{
 clgname="mit";
} 
student(String e,int d)
{
stuname=e;
rollno=d;
}
void show()
{
System.out.println(stuname+""   +rollno+""  +clgname+"");
}
public static void main(String[]args)
{
student.change();
student m=new student("ramya"   ,4043);
student m1=new student("tanya"  ,4044);
student m2=new student("sam"    ,4046);
m.show();
m1.show();
m2.show();
}
}
