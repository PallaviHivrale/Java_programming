////////////////////////////////////////////////////////////////////////
//
//  Function Name : ToggleX
//  Description :  accept string from user and toggle the case 
//  Input :   string
//  Output :  string         
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
    public String strToggleX(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(iCnt= 0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z' )
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);       
            }
            else if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }
        
        return new String(Arr);        
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////
class program36_3
{
    public static void main(String A[])
    {
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        sRet =strobj.strToggleX(sobj);      

        System.out.println("updated string:"+sRet);
        
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