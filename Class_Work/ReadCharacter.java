import java.util.Scanner;

class ReadCharacter
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in) ;

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        System.out.println("character is : "+ch);

    }
}