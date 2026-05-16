import java.util.Scanner;

class Simpleintrest
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in) ;

        System.out.println("Enter the principle");
        float p = sobj.nextFloat();
        
        System.out.println("Enter the rate of intrest");
        float r = sobj.nextFloat();

        System.out.println("Enter time");
        float t = sobj.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("principle: "+p);
        System.out.println("Rate: "+r);
        System.out.println("Time: "+t);

        System.out.println("simple intrest"+ si);

       sobj.close();

    }
}