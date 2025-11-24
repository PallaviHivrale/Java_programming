/*
    iRow : 5
    iCol : 5

    input:5
    Output: 1   *   2   *   3   *   4   *   5   *
    
    

*/

////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description :  It is used to print patterns on screen 
//  Input :  Integer
//  Output : 1  *   2   *   3   *   4   *   5   * 
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
            System.out.print(iCnt +"\t*\t");
        }
        System.out.println();
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////

class program26_3
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
//  Output : 1  *   2   *   3   *   4   *   5   *   
//  
////////////////////////////////////////////////////////////////////////