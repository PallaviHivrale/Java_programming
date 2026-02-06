//accept one number & position from user & check whether bit at that position is on or off
import java.util.Scanner;

class program66_1
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 1, iResult = 0, iPos =0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        System.out.println("Enter the position :");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos -1); // Shift 1 to the given position to create mask

        iResult = iNo & iMask; // Use AND to check whether that bit is ON or OFF

        if(iResult == iMask)  // If result equals mask → that bit is ON
        {
            System.out.println(iPos+"th bit is ON");
        }
        else
        {
            System.out.println(iPos+"th bit is OFF");
        }
    }
}