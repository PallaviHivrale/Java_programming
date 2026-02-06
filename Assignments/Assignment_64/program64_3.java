// write a program which checks whether 7th & 15th & 21th & 28th bit is on or off

import java.util.Scanner;
class program64_3
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00000040 | 0x00004000 | 0x00100000 | 0x08000000;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th & 15th & 21th & 28th bit are ON");
        }
        else
        {
            System.out.println("7th & 15th & 21th & 28th bit are OFF");
        }
    
    }
}


// 0000   0000    0000    0000    0000    0000    0000    0000