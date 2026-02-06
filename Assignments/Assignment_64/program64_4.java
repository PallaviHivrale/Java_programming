// write a program which checks whether 7th & 8th & 9th  bit is on or off

import java.util.Scanner;
class program64_4
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00000040 | 0x00000080 | 0x00000100 ;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th & 8th & 9th bit are ON");
        }
        else
        {
            System.out.println("7th & 8th & 9th bit are OFF");
        }
    
    }
}


// 0000   0000    0000    0000    0000    0000    0000    0000