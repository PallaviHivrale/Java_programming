import java.util.*;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Budget = 0;
        int N = 0;
        int Price = 0;

        int Count = 0;
        int Remaining = 0;

        System.out.println("Enter the Budget Amount : ");
        Budget = sobj.nextInt();

        System.out.println("Enter number of items : ");
        N = sobj.nextInt();

        // Validation
        if(Budget < 0 || N < 0)
        {
            System.out.println("Invalid Output");
            sobj.close();
            return;
        }

        Remaining = Budget;

        // Taking prices one by one
        for(int i = 1; i <= N; i++)
        {
            System.out.println("Enter the price of item " + i + " : ");
            Price = sobj.nextInt();

            if(Price <= 0)
            {
                System.out.println("Invalid Output");
                sobj.close();
                return;
            }

            if(Remaining >= Price)
            {
                Remaining = Remaining - Price;
                Count++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased : " + Count);
        System.out.println("Remaining Balance : " + Remaining);

        sobj.close();
    }
}