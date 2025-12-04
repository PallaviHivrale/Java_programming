////////////////////////////////////////////////////////////////////////
//
//  Function Name : Dispaly
//  Description : check whether string contain vowels or not 
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
    public boolean ChkVowel(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt]=='a'|| Arr[iCnt]=='e'|| Arr[iCnt]=='i'|| Arr[iCnt]=='o'|| Arr[iCnt]=='u' ||
            Arr[iCnt] =='A'|| Arr[iCnt]=='E'|| Arr[iCnt]=='I'|| Arr[iCnt]=='O'|| Arr[iCnt]=='U'))
            {
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////
class program35_4
{
    public static void main(String A[])
    {    
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        boolean bRet =strobj.ChkVowel(sobj);

        System.out.println(bRet);
    } 
}
////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  marvellous
//  Output :     true  
//
//  Input :     xyz
//  Output :    false
//  
////////////////////////////////////////////////////////////////////////