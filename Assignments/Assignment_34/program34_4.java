////////////////////////////////////////////////////////////////////////
//
//  Function Name : Dispaly
//  Description : Accept character from user. 
//                If it is capital then display all the characters from the input characters till Z.
//                If input character is small then print all the characters in reverse order till a.
//                In other cases return directly.
//  Input :   char
//  Output :  boolean             
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
    public boolean ChkSpecial(char ch)
    {
        if(ch == '!' || ch == '@' || ch == '#' || ch == '$' ||
           ch == '%' || ch == '^' || ch == '&' || ch == '*')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////
class program34_4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a single character : ");
        char ch = scanobj.next().charAt(0);

        StringX strobj = new StringX();

        boolean result = strobj.ChkSpecial(ch);

        System.out.println(result);
        
    }  
}
////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  # 
//  Output : true             
//  
////////////////////////////////////////////////////////////////////////