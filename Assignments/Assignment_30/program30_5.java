////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description : It is used to print patterns on screen 
//  Input :     Integer 
//  Output :        1   2   3   4
//                  1   *   *   4
//                  1   *   *   4
//                  1   2   3   4
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

        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            System.out.println("row number and coloumn number should be same");
            return;
        }
        
        for(i=1; i<=iRow; i++)
        { 
                   
            for(j=1; j<=iCol; j++)
            {
                if(i==1 || i==iRow )
                {
                    System.out.printf(j+"\t",j);
                }
                else if(j==1 || j==iCol)
                {
                    System.out.printf(j+"\t");
                }
                else
                {
                    System.out.print("*\t");
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

class program30_5
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
//  Input: iRow= 6  iCol= 5
//
//  Output :        1   2   3   4
//                  1   *   *   4
//                  1   *   *   4
//                  1   2   3   4
////////////////////////////////////////////////////////////////////////