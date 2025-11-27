class CheckPrime 
{
    void checkPrime(int num)
    {
        if (num < 2)
        {
            System.out.println(num + " is Not Prime");
        
        }

        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                System.out.println(num + " is Not Prime");
             
            }
        }
        System.out.println(num+"is Prime"); 
    }
}

class program18_1
{
    public static void main(String A[])
    {
        CheckPrime pobj = new CheckPrime();
        pobj.checkPrime(11);

    }
}