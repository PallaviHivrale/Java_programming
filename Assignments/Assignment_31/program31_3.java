////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description : It is used to print patterns on screen 
//  Input :     Integer 
//  Output :                
//               $   *   *   *   *
//               #   $   *   *   *
//               #   #   $   *   *
//               #   #   #   $   *
//               #   #   #   #   $
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
                if(i==j )
                {
                    System.out.printf("%%\t");
                }
                else if(i>=j)
                {
                    System.out.printf("#\t");
                }
                else 
                {
                    System.out.printf("*\t");
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

class program31_3
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
//  Output :                
//               $   *   *   *   *
//               #   $   *   *   *
//               #   #   $   *   *
//               #   #   #   $   *
//               #   #   #   #   $
////////////////////////////////////////////////////////////////////////