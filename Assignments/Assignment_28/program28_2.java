////////////////////////////////////////////////////////
//
//  File Name : program27_1.c
//  Description :  pattern printing 
//
//  Input :  iRow = 4    iCol = 4
//  Output :    A   B   C   D
//              a   b   c   d
//              A   B   C   D
//              a   b   c   d
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

        for(i = 1; i <= iRow; i++)
        {
            char ch = 'A';

        if(i % 2 != 0)
        {
            ch ='A';
        }
        else
        {
           ch = 'a';
        }

        for(j=1; j<=iCol; j++)
        {
            System.out.printf("%c\t",ch);
            ch++;  
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

class program28_2
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
//  Output :    A   B   C   D
//              a   b   c   d
//              A   B   C   D
//              a   b   c   d
//  
////////////////////////////////////////////////////////////////////////