class FindFactorial
{   
    void findFactorial(int num)
    {
        int ifact = 1;

        for(int i = 1; i <= num; i++)
        {
            ifact = ifact * i;
        }

        System.out.println("Factorial of number is: " + ifact);
    }
}

class program16_3
{
    public static void main(String A[])
    {
        FindFactorial fobj = new FindFactorial();
        fobj.findFactorial(5);
    }
}
