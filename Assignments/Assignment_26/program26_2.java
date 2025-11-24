/*
    iRow : 5
    iCol : 5

    input:5
    Output: 5   #   4   #   3   #   2   #   1   #
    

*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt= iNo; iCnt>=1; iCnt--)
        {
           System.out.print(iCnt + "\t#\t");
        }
        System.out.println();
    }
}

class program26_2
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