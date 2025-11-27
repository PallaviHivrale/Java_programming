class MaxNumber
{
    public int findMax(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}

class program17_3
{
    public static void main(String[] args)
    {
        MaxNumber mobj = new MaxNumber(); 
        int max = mobj.findMax(20, 15); 
        System.out.println("Maximum number is: " + max);
    }
}
