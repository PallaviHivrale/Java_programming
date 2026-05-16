import java.util.Scanner;

class SumOfTwoNumbers
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in) ;

       System.out.println("Enter the first number");
       int num_1 = sobj.nextInt();
       
       System.out.println("Enter the second number");
       int num_2 = sobj.nextInt();

       int Sum = num_1 + num_2;
       System.out.println("sum is : "+Sum);

       sobj.close();

    }
}