//accept one number & position from user & check whether bit at that position from user & OFF that bit 
import java.util.Scanner;

class program66_2
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

        iResult = iNo & (~iMask); //OFF that bit using AND with inverted mask
        System.out.println("Modified number : "+iResult);
    }
}