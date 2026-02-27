import java.util.*;

class program75_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        int Remaining = 0;

        double Tax = 0;

        System.out.println("Enter the income : ");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Income can not be negative");
            sobj.close();
            return;
        }

        Remaining = Income;
        if(Remaining > 1000000)
        {
            Tax = Tax + (Remaining - 1000000) * 0.30;
            Remaining = 1000000;
        }

        if(Remaining > 500000)
        {
            Tax = Tax + (Remaining - 500000) * 0.20;
            Remaining = 500000;
        }

        if(Remaining > 250000)
        {
            Tax = Tax + (Remaining - 250000) * 0.05;
        }

        System.out.println("Annual Income : " + Income);
        System.out.println("Total Tax Payable : " + Tax);

        sobj.close();
    }
}