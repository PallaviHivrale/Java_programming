import java.util.*;

class program76_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        String PeakHour = null;

        double Fare = 0;
        double TotalFare = 0;

        System.out.println("Enter Distance in KM : ");
        Distance = sobj.nextInt();

        System.out.println("Enter PeakHours in KM : ");
        PeakHour = sobj.next();

        if(Distance < 0)
        {
            System.out.println("Distance can not be negative");
            sobj.close();
            return;
        }

        // Fare Calculation
        if(Distance <= 10)
        {
            Fare = 50 + (Distance * 12);
        }
        else
        {
            Fare = 50 + (10 * 12) + ((Distance - 10) * 15);
        }

        // Peak Hour Surcharge
        if(PeakHour.equalsIgnoreCase("Yes"))
        {
            TotalFare = Fare + (Fare * 0.20);
        }
        else if(PeakHour.equalsIgnoreCase("No"))
        {
            TotalFare = Fare;
        }
        else
        {
            System.out.println("Invalid Peak Hour Input");
            sobj.close();
            return;
        }

        System.out.println("\nDistance : " + Distance + " km");
        System.out.println("Peak Hour : " + PeakHour);
        System.out.println("Total Fare : " + TotalFare);


        sobj.close();
    }
}