//accept one number & position from user &  toggle that bit 
import java.util.Scanner;

class program66_4
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 1, iResult = 0, iPos =0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number :");
        iNo = sobj.nextInt();

        System.out.println("Enter the position :");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos -1); 

        iResult = iNo ^ iMask; 
        System.out.println("Modified number : "+iResult);
    }
}