////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description : accept character from user and check whether it is small
//                alphabet or not(a-z)
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
    public boolean chkSmall(char ch)
    {
        if((ch>='a' && ch <= 'z'))
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

class program33_4
{
    public static void main(String A[])
    {
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch = scanobj.next().charAt(0);

        StringX strobj = new StringX();

        System.out.println(strobj.chkSmall(ch));
        
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input:   a
//  Output : true
//
//  Input :  A
//  output : false
//  
////////////////////////////////////////////////////////////////////////