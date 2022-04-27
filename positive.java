import java.util.Scanner;
public class positive
{
       public static void main(String[] ars)
       {
          int num,sum=0;
          Scanner input = new Scanner(System.in);
          System.out.print("Enter Numbers(Negative Number to Quit) :");
          while(true)
                 {
                         num=input.nextInt(); //Read number
                         if(num<0)
                         break;
                         sum +=num;
                 }
                         System.out.println( "Sum is : " +sum);
        }
}


