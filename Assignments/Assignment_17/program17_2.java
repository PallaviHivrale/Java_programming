class CheckPalindrome
{   
    boolean checkPalindrome(int num)
    {
        int temp = num;
        int rev = 0;

        while(num != 0)
        {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }

        return temp == rev;
    }
}

class program17_2
{
    public static void main(String A[])
    {
        CheckPalindrome pobj = new CheckPalindrome();

        int number = 121;

        if(pobj.checkPalindrome(number))
        {
            System.out.println(number + " is a palindrome number");
        }
        else
        {
            System.out.println(number + " is NOT a palindrome number");
        }
    }
}
