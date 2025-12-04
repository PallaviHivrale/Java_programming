////////////////////////////////////////////////////////////////////////
//
//  Function Name : Dispaly
//  Description : Accept character from user. 
//                If it is capital then display all the characters from the input characters till Z.
//                If input character is small then print all the characters in reverse order till a.
//                In other cases return directly.
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
    public void Display(String str)
    {
        int iCnt =0;
        char Arr[] = str.toCharArray();

        for(iCnt= 0; iCnt<Arr.length; iCnt++)
        { 
            char ch = Arr[iCnt];

            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z' )
            {
                for(char c=ch; c<='Z'; c++)
                {
                    System.out.print(c+"\t");
                }   
                System.out.println();    
            }
            else if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                for(char c=ch; c>='a'; c--)
                {
                    System.out.print(c+"\t");
                }
                System.out.println();
            }
        }        
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////////////
class program34_3
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        strobj.Display(sobj);      
        
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