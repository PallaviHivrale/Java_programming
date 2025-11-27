class MulTable
{
    void printTable(int iNo)
    {
        int icnt = 0;

        for(icnt = 1; icnt <= 10; icnt++)   //short hand assignment operator
        {
            System.out.print((iNo*icnt)+"\t");
        }
        System.out.println();
    }
}

class program17_5
{
    public static void main(String A[])
    {
        MulTable mobj = new MulTable();
        mobj.printTable(5);

    }
}