////////////////////////////////////////////////////////
//
//  File Name : program27_1.c
//  Description :  pattern printing 
//
//  Input :  iRow = 3    iCol = 5
//  Output :    A   A   A   A   A
//              B   B   B   B   B
//              C   C   C   C   C
//  Author : Pallavi Kishanrao Hivrale
//  Date :   21/11/25
//
////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'A';

        for(i = 1; i <= iRow; i++)
        {
            for(j=1; j<=iCol; j++)
            {
                System.out.printf("%c\t",ch);
               
            }
            ch++;
            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////

class program28_3
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
//  Input :  iRow = 3    iCol = 5
//  Output :    A   A   A   A   A
//              B   B   B   B   B
//              C   C   C   C   C
//  
////////////////////////////////////////////////////////////////////////