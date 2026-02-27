import java.util.*;

class program75_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalHours = 0;
        int ParkingFees = 0; 

        System.out.println("Enter Total Parking Hours : ");
        TotalHours = sobj.nextInt();

        if(TotalHours < 0)
        {
            System.out.println("Hours can not be negative");
            return;
        }

        if(TotalHours == 0)
        {
            ParkingFees = 0;
        }
        else if(TotalHours <= 2)
        {
            ParkingFees = 20;
        }
        else if(TotalHours >= 3 && TotalHours <= 10)
        {
            ParkingFees = 20 + (TotalHours -2) * 10;
        }
        else if(TotalHours > 10)
        {
            ParkingFees = 20 + (TotalHours-2) * 10 + 50;
        }

        System.out.println("Total that correct answerl parking Duration : "+TotalHours);
        System.out.println("Total Parking fees : "+ParkingFees);

        sobj.close();
    }
}