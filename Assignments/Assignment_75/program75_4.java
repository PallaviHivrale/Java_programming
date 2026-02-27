import java.util.*;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Fine = 0;

        String Helmet = null;
        String Licence = null;
        String Overspeeding = null;

        System.out.println("Helmet Worm : ");
        Helmet = sobj.nextLine();

        System.out.println("Licence Available (Yes/No)");
        Licence = sobj.nextLine();

        System.out.println("Overspeeding (Yes/No)");
        Overspeeding = sobj.nextLine();

        // Validation
        if((!Helmet.equalsIgnoreCase("Yes") &&
            !Helmet.equalsIgnoreCase("No")) ||

           (!Licence.equalsIgnoreCase("Yes") &&
            !Licence.equalsIgnoreCase("No")) ||

           (!Overspeeding.equalsIgnoreCase("Yes") &&
            !Overspeeding.equalsIgnoreCase("No"))) 
        {

            System.out.println("Invalid Input");
            return;
        }

        if(Helmet.equalsIgnoreCase("No"))
        {
            Fine = Fine + 500;
        }

        if(Licence.equalsIgnoreCase("No"))
        {
            Fine = Fine + 1000;
        }

        if(Overspeeding.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount : "+Fine);

        sobj.close();
    }
}