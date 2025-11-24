////////////////////////////////////////////////////////
//
//  File Name : program26_4.c
//  Description : It is used to print patterns on screen 
//  Input :  Integer
//  Output : #   1   *    #   2   *   #   3   *   #   4   *   
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
            System.out.print(iCnt+"\t*\t");
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////

class program26_4
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
//  Output : #   1   *    #   2   *   #   3   *   #   4   *   
//  
////////////////////////////////////////////////////////////////////////