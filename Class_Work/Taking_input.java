import java.util.Scanner;

class Taking_input
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in) ;

       System.out.println("Enter your name");
       String name = sobj.nextLine();
       System.out.println("Name is : "+name);

       System.out.println("Enter your lucky number");
       int number = sobj.nextInt();
       System.out.println("Lucky number is :"+number);

       sobj.close();

    }
}