////////////////////////////////////////////////////////////////////////
//
//  Function Name : Dispaly
//  Description : Accept character from user and display its
//                ASCII value in decimal,octal,and hexadecimal format 
//  Input :   char
//  Output :  integer(ASCII)            
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
    public void Display(char ch)
    {
        int i = 0;
        int ASCII = (int)ch;

        for(i=0; i<1; i++)
        {
            System.out.println("\nCharacter : "+ch);
            System.out.println("Decimal :"+ASCII);
            System.out.println("Octal : "+Integer.toOctalString(ASCII));
            System.out.println("Hex : "+Integer.toHexString(ASCII).toUpperCase());
        }

    }

}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////
class program34_5
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = scanobj.next().charAt(0);

        StringX strobj = new StringX();

        strobj.Display(ch);
        
    }  
}
////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  A
//  Output : Character : A
//           Decimal :65
//           Octal : 101
//           Hex : 41          
//  
////////////////////////////////////////////////////////////////////////