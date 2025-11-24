////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description : It is used to print patterns on screen 
//  Input :  iRow = 5    iCol = 5
//  Output :    1    2   3   4   5
//             -1   -2  -3  -4  -5
//              1    2   3   4   5
//             -1   -2  -3  -4  -5
//              1    2   3   4   5
//  Date :      21/11/25
//
////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;  
        int num = 1;  
        
        for(i=1; i<= iRow; i++)
        {
            for(j=1; j<=iCol; j++)
            {
                if(i % 2 == 1)
                {
                System.out.printf("%d\t",j);
                }
                else
                {
                    System.out.printf("-%d\t",j);
                }
            }
            System.out.printf("\n");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////

class program29_4
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
//  Input :  iRow = 4    iCol = 4
//  Output :    2   4   6   8   10
//              1   3   5   7   9
//              2   4   6   8   10
//              1   3   5   7   9
//  
////////////////////////////////////////////////////////////////////////