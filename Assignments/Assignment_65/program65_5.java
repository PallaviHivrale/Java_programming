// accept one no. from user & on its first 4 bits return modified number

import java.util.Scanner;

class program65_5
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x0F;   // Mask to ON first 4 bits
        
        iResult = iNo | iMask;  // ON first 4 bits of the number using OR operation

        System.out.println("Modified Number is :"+iResult);
    }
}