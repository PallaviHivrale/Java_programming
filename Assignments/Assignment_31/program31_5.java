////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description : It is used to print patterns on screen 
//  Input :     Integer 
//  Output :                
//             1    2   3   4
//                  2   3   4
//                      3   4
//                          4  
//  Author : Pallavi Kishanrao Hivrale
//  Date :   22/11/25
//
////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{   
    public void Display(int iRow, int iCol)
    {
        int i = 0, j=0;

        
        for(i=1; i<=iRow; i++)
        { 
                   
            for(j=1; j<=iCol; j++)
            {
                if( j>=i)
                {
                    System.out.printf("%d\t",j);
                }
                else
                {
                    System.out.print("\t");
                }
             
            }
            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////

class program31_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;
    
        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Coloumns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    
    }  
}

////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input: iRow= 4  iCol= 4
//
//  Output :                
//             1    2   3   4
//                  2   3   4
//                      3   4
//                          4  
////////////////////////////////////////////////////////////////////////