////////////////////////////////////////////////////////////////////////
//
//  Function Name : Reverse
//  Description :  display string in reverse order 
//  Input :   string
//  Output :  void           
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
    public void Reverse(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = Arr.length-1; iCnt >= 0; iCnt--)
        {
            System.out.print(Arr[iCnt]);
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////
class program35_5
{
    public static void main(String A[])
    {    
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.Reverse(sobj);
    } 
}
////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input :  marvellous
//  Output : suollevram  
//
//  
////////////////////////////////////////////////////////////////////////