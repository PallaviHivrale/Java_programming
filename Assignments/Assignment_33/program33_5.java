////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description : This program displays the exam time based on the
//                division entered by the user.
//    Input :     Bool
//    Output :                
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class StringX
{ 
    public void DisplaySchedule(char chDiv)
    {
        // FILTER: convert input to uppercase
        chDiv = Character.toUpperCase(chDiv);

        switch(chDiv)
        {
            case 'A':
            {
                System.out.println("Your exam is at 7:00 AM\n");
                break;
            }
            case 'B':
            {
                System.out.println("Your exam is at 8:30 AM\n");
                break;
            }
            case 'C':
            {
                System.out.println("Your exam is at 9:20 AM\n");
                break;
            }
            case 'D':
            {
                System.out.println("Your exam is at 10:30 AM\n");
                break;
            }
            default:
            {
                System.out.println("Invalid division! Please enter A, B, C, or D.\n");
                break;
            }
        }    
    }
    
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////

class program33_5
{
    public static void main(String A[])
    {

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char chDiv = scanobj.next().charAt(0);

        StringX strobj = new StringX();
        strobj.DisplaySchedule(chDiv);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input:   C
//  Output : your exam is at 9.20
//
//  Input :  d
//  output : your exam is at 10.30
//  
////////////////////////////////////////////////////////////////////////