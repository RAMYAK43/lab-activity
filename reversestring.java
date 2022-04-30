//using StringBuilder--it has inmbuild function --it is reverse()--
//reverseString to String we use toString() function--
import java.util.Scanner;
class reversestring
{
public static void main(String[]args)
{
Scanner r=new Scanner(System.in);
System.out.println("enter a word or sentense=");
String a=r.nextLine();
StringBuilder rv=new StringBuilder(a);
rv.reverse();
String result=rv.toString();
System.out.println("reversed word or sentense=" +result);
}
}
