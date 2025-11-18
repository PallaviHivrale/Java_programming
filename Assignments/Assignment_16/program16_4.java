class ReverseNumber
{   
    void reverseNumber(int num)
    {
       int rev = 0;  
       int temp = num;

       while(temp!=0)
       {
            int digit = temp % 10;    
            rev = rev * 10 + digit;   
            temp = temp / 10;
       }
       System.out.println("Reverse of number " + num + " is: " + rev);
    }
}

class program16_4
{
    public static void main(String A[])
    {
        ReverseNumber robj = new ReverseNumber();
        robj.reverseNumber(1234);
    }
}
