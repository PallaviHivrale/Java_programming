////////////////////////////////////////////////////////////////////////
//
//  Function Name : Dispaly
//  Description : Convert uppercase to lowercase and lowercase to uppercase
//  Input :   char
//  Output :  char               
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
    public String Display(String str)
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
class program34_2
{
    public static void main(String A[])
    {
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        sRet =strobj.Display(sobj);      

        System.out.println("updated string:"+sRet);
        
    }  
}
////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  D
//  Output : d              
//  
////////////////////////////////////////////////////////////////////////