// accept one no. from user & off 7th bit and 10th  bit of that number if it is on return modified number

import java.util.Scanner;
class program65_2
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00000040 | 0x00000200   ;
        
        iResult = iNo & (~iMask);

        System.out.println("Modified Number is :"+iResult);
    }
}


    