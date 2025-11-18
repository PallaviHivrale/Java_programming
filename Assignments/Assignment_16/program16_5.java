class CountDigits
{   
    void countDigits(int num)
    {
        int count = 0;
        int temp = num;

        while(temp!=0)
        {
            temp = temp/10;
            count++;
        }
        System.out.println(count); 
    }
}

class program16_5
{
    public static void main(String A[])
    {
        CountDigits robj = new CountDigits();
        robj.countDigits(7865);
    }
}
