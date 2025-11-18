class CalculateSum 
{   
    void CalculateSum(int iNo)
    {
        int iSum =0, iCnt=0;
        for(iCnt=0; iCnt<=iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println("Sum is : "+iSum);
    }

}
class program16_1
{
    public static void main(String A[])
    {
        CalculateSum cobj = new CalculateSum();
        cobj.CalculateSum(10);
    }
}
