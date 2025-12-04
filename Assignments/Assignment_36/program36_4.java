////////////////////////////////////////////////////////////////////////
//
//  Function Name : ToggleX
//  Description :  accept string from user and display only digits from string     
//  
//  Input :   string
//  Output :  int        
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
    public void DisplayDigits(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(iCnt= 0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= '0' && Arr[iCnt] <= '9' )
            {
                System.out.print(Arr[iCnt]);      
            }
        }
        System.out.println();        
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////
class program36_4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        strobj.DisplayDigits(sobj);      
    }
} 

////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  MarvellouS
//  Output : mARVELLOUs 
//
//  
////////////////////////////////////////////////////////////////////////