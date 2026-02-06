// accept one no. from user & toggle 7th bit of that number. return nodified number

import java.util.Scanner;
class program65_3
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00000040;
        
        iResult = iNo ^ iMask;

        System.out.println("Modified Number is :"+iResult);
    }
}