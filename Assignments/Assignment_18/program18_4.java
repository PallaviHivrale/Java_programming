class DigitSum
{
    void sumEvenOddDigits(int iNum)
    {
        int evenSum = 0;
        int oddSum = 0;

        while(iNum > 0)
        {
            int digit = iNum % 10;  

            if(digit % 2 == 0)
            {
                evenSum += digit; 
            }  
            else
            {
                oddSum += digit;    
            }
            iNum = iNum/10;          
        }
        System.out.println("Sum of Even Digits: " + evenSum);
        System.out.println("Sum of Odd Digits : " + oddSum);
    }
}

class program18_4
{
    public static void main(String A[])
    {
        DigitSum dobj = new DigitSum();
        dobj.sumEvenOddDigits(123456);
    }
}