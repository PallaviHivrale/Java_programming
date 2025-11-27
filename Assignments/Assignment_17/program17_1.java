class SumOfDigits
{   
    void sumOfDigits(int num)
    {
        int iSum = 0;
        int temp = num;

        while(temp != 0)
        {
            iSum = iSum + (temp % 10); 
            temp = temp / 10;          
        }

        System.out.println("sum of digits is: " + iSum); 
    }
}

class program17_1
{
    public static void main(String A[])
    {
        SumOfDigits sobj = new SumOfDigits();
        sobj.sumOfDigits(7865);  
    }
}
