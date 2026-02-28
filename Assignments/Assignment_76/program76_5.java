import java.util.*;

class program76_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Battery = 0;

        System.out.println("Enter Battery percentage : ");
        Battery = sobj.nextInt();

        if(Battery < 0 || Battery > 100)
        {
            System.out.println("Invalid input");
            sobj.close();
            return;
        }

        System.out.println("Battery percentage : "+Battery+"%");
        
        if(Battery <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(Battery <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Nomal");
        }

        sobj.close();
    }
}