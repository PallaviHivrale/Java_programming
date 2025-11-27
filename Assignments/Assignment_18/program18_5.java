class CheckSign
{
    void checkSign(int iNum)
    {
        if(iNum>0)
        {
            System.out.println(iNum +"is positive");
        }
        else if(iNum<0)
        {
            System.out.println(iNum +"is negative");
        }
        else 
        {
            System.out.println(iNum +"is zero");
        }

    }
}

class program18_5
{
    public static void main(String A[])
    {
        CheckSign sobj = new CheckSign();
        sobj.checkSign(-8);
    }
}