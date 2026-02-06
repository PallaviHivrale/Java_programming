// write a program which checks whether first and last bit is ON or OFF

import java.util.Scanner;
class program64_5
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x00000001 | 0x80000000  ;
        
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("1st & 32nd bit are ON");
        }
        else
        {
            System.out.println("1st & 32nd bit are OFF");
        }
    
    }
}


// 0000   0000    0000    0000    0000    0000    0000    0000