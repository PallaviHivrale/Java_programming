class CheckEvenOdd
{   
    void CheckEvenOdd(int Num)
    {
        if(Num % 2 == 0)
        {
            System.out.println(Num + " is an Even number");

        }
        else
        {
            System.out.println(Num + " is an odd number");

        }
    }

}
class program16_2
{
    public static void main(String A[])
    {
        CheckEvenOdd cobj = new CheckEvenOdd();
        cobj.CheckEvenOdd(7);
    }
}
