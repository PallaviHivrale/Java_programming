import java.util.*;

class program74_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        double Income = 0;
        int Creditscore = 0;
        String LoanStatus = null;

        System.out.println("Enter Age: ");
        Age = sobj.nextInt();

        System.out.println("Enter Monthly Income: ");
        Income = sobj.nextDouble();

        System.out.println("Enter Credit Score: ");
        Creditscore = sobj.nextInt();

        System.out.println("Existing unpaid loan(Yes/No)");
        LoanStatus = sobj.nextLine();


        if(Age < 0 || Income < 0 || Creditscore < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected: Age not eligible");
        }
        else if(Income < 25000)
        {
            System.out.println("Loan Rejected : Income too Low");
        }
        else if(Creditscore < 700)
        {
            System.out.println("Loan Rejected : Credit score too low");
        }
        else if(LoanStatus.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected : Existing unpaid Loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }

        sobj.close();
    }
}