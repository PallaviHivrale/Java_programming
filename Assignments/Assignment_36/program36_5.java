////////////////////////////////////////////////////////////////////////
//
//  Function Name : CountWhite
//  Description :  accept string from user and count number of white spaces      
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
    public int CountWhite(String str)
    {
        int iCnt = 0;
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(iCnt= 0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ' ' )
            {
                iCount++;     
            }
        }
        return iCount;        
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////
class program36_5
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        int iRet = strobj.CountWhite(sobj); 
        System.out.println("Number of white spaces : " + iRet);     
    }
} 

////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  MarvellouS
//  Output : 0 
//  
//  Input :  MarvellouS Infosystem
//  Output : 1 
//  
////////////////////////////////////////////////////////////////////////