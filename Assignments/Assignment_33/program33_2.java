////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description : accept character from user and check whether it is capital alphabet or not(A-Z a-z)
//  Input :     Bool
//  Output :                
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class StringX
{ 
    public boolean chkCapital(char ch)
    {
        if((ch>='A' && ch <= 'Z'))
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
////////////////////////////////////////////////////////////////////////

class program33_2
{
    public static void main(String A[])
    {
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch = scanobj.next().charAt(0);

        StringX strobj = new StringX();

        System.out.println(strobj.chkCapital(ch));
        
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input:   F
//  Output : true
//
//  Input : d
//  output : false
//  
////////////////////////////////////////////////////////////////////////