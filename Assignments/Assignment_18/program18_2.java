class EvenNumber
{
    void printEvenNumber(int iNum)
    {
        int iCnt= 0;

        for(iCnt=2; iCnt<=iNum; iCnt+=2)
        {
            System.out.print(iCnt+"\t");
        }
        System.out.println(); 
    }
}

class program18_2
{
    public static void main(String A[])
    {
        EvenNumber eobj = new EvenNumber();
        eobj.printEvenNumber(20);

    }
}