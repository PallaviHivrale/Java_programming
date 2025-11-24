////////////////////////////////////////////////////////
//
//  File Name : program26_4.c
//  Description : It is used to print patterns on screen 
//  Input :  Integer
//  Output : 2 4 6 8 10 12 14 16   
//  Author : Pallavi Kishanrao Hivrale
//  Date :   21/11/25
//
////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt<= iNo; iCnt++)
        {
            System.out.print((iCnt*2)+"\t");
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////

class program26_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frequency : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    
    }  
}

////////////////////////////////////////////////////////////////////////
//
//  Test cases successfully handled by application
//
//  Input: 5
//
//  Output : 2 4 6 8 10 12 14 16   
//  
////////////////////////////////////////////////////////////////////////