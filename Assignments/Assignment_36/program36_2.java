////////////////////////////////////////////////////////////////////////
//
//  Function Name : Reverse
//  Description :  accept string from user convert it  lower case 
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
    public String toUpperCaseX(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(iCnt= 0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z' )
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
class program36_2
{
    public static void main(String A[])
    {
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        sRet = strobj.toUpperCaseX(sobj);      

        System.out.println("updated string:"+sRet);
        
    }
} 

////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  marvellous
//  Output : MARVELLOUS 
//
//  
////////////////////////////////////////////////////////////////////////