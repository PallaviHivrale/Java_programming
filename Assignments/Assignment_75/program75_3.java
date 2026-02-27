import java.util.*;

class program75_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Stock = 0;
        int Quantity = 0;
        int Remaining = 0;

        System.out.println("Enter the stocks : ");
        Stock = sobj.nextInt();

        System.out.println("Enter the requested quantity : ");
        Quantity = sobj.nextInt();

        if(Stock < 0 || Quantity <= 0)
        {
            System.out.println("Stock can not be negative");
            return;
        }

        if(Quantity > Stock)
        {
            System.out.println("Order Failed : Insufficient Stock");
        }
        else 
        {
            Remaining = Stock - Quantity;

            System.out.println("Order process Sucessfully, Remaining Stock : "+Remaining);

            if(Remaining < 5)
            {
                System.out.println("Low stock Alert!");
            }
        }

        sobj.close();
    }
}