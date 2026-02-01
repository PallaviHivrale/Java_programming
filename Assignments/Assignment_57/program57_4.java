// Program to calculate checksum of file

import java.io.*;
import java.util.*;

class Program57_4
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int CheckSum = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Buffer[] = new byte[1024];

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                for(int i = 0; i < iRet; i++)
                {
                    CheckSum = CheckSum + Buffer[i];
                }
            }

            System.out.println("Checksum of file is : " + CheckSum);

            fiobj.close();
        }
        else
        {
            System.out.println("File does not exist");
        }

        sobj.close();
    }
}
