import java.util.*;

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int Income = 0;

        System.out.println("Enter Marks Percentage : ");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendance Percentage : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Family Income : ");
        Income = sobj.nextInt();

        if(Marks < 0 || Marks > 100)
        {
            System.out.println("Invalid Marks Input");
            sobj.close();
            return;
        }

        if(Attendance < 0 || Attendance > 100)
        {
            System.out.println("Invalid Attendance Input");
            sobj.close();
            return;
        }

        if(Income < 0)
        {
            System.out.println("Income cannot be negative");
            sobj.close();
            return;
        }

        if(Marks >= 80 && Attendance >= 75 && Income <= 300000)
        {
            System.out.println("Scholarship Approved");
        }
        else
        {
            System.out.print("Scholarship Rejected : ");

            if(Marks < 80)
            {
                System.out.print("Marks below 80% ");
            }

            if(Attendance < 75)
            {
                System.out.print("Attendance below 75% ");
            }

            if(Income > 300000)
            {
                System.out.print("Income exceeds ₹300000 ");
            }
        }


        sobj.close();
    }
}