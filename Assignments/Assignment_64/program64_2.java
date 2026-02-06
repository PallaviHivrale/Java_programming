// write a program which checks whether 5th & 18th bit is on or off

import java.util.Scanner;
class program64_2
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00000010 | 0x00020000;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("5th & 18th bit are ON");
        }
        else
        {
            System.out.println("5th & 18th bit is OFF");
        }
    
    }
}


