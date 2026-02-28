import java.util.*;

class program76_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0;
        int Charge = 0;

        System.out.println("Enter parcel weight in kg : ");
        Weight = sobj.nextInt();

        if(Weight <= 0)
        {
            System.out.println("Weight must be greater than 0 ");
            sobj.close();
            return;
        }

        if(Weight <= 1)
        {
            Charge = 50;
        }
        else if(Weight <= 5)
        {
            Charge = 50 + ((Weight -1) * 20);
        }
        else if(Weight > 5)
        {
            Charge = 150 + ((Weight - 5) * 30);
        }

        System.out.println("Parcel Weight : "+Weight);
        System.out.println("Courier Charge : "+Charge);

        sobj.close();
    }
}