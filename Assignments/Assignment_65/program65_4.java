// accept one no. from user & toggle 7th and 10th bit of that number. return nodified number

import java.util.Scanner;

class program65_4
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00000040 | 0x00000200;
        
        iResult = iNo ^ iMask;

        System.out.println("Modified Number is :"+iResult);
    }
}