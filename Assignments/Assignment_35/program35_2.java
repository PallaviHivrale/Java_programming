////////////////////////////////////////////////////////////////////////
//
//  Function Name : Dispaly
//  Description : Acount number of small character
//  Input :   char
//  Output :  integer            
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        int iCount = 0;
       
        char Arr[] = str.toCharArray();
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt]<= 'z')
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
class program35_2
{
    public static void main(String A[])
    {
        int iRet =0;
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        iRet =strobj.CountSmall(sobj);

        System.out.println("frequency of small character is:"+iRet);
        
    } 
}
////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  mARVELLOUS mULTI os
//  Output :     4   
//  
////////////////////////////////////////////////////////////////////////