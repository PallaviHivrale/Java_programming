//accept one number & toggle contents of first & last nibble

import java.util.Scanner;

class program66_5
{
    public static void main(String A[])
    {
        int iNo = 0, iMask1 = 0, iMask2 = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        iMask1 = 0x0000000F;
        iMask2 = 0xF0000000;

        iMask = iMask1 | iMask2; // Combine both masks

        iResult = iNo ^ iMask; // Toggle first & last nibble using XOR

        System.out.println("Modified number : "+iResult);
    }
}