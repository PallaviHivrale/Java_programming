class OddNumber
{
    void printOddNumber(int iNum)
    {
        int iCnt= 0;

        for(iCnt=1; iCnt<=iNum; iCnt+=2)
        {
            System.out.print(iCnt+"\t");
        }
        System.out.println(); 
    }
}

class program18_3
{
    public static void main(String A[])
    {
        OddNumber oobj = new OddNumber();
        oobj.printOddNumber(20);

    }
}