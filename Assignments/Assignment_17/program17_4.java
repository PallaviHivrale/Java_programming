class MinNumber
{
    public int findMin(int a, int b, int c)
    {
       if(a<=b && a<=c) 
       {
        return a;
       }
       else if(b<=a && b<=c) 
       {
        return b;
       }
       else
       {
        return c;
       }
    }
}

class program17_4
{
    public static void main(String A[])
    {
        MinNumber mobj = new MinNumber();
        int min = mobj.findMin(3,7,2);

        System.out.println("Minimum number is: " + min);
    }
}