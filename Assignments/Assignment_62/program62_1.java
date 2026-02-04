// Display total number of bytes read from that file

import java.io.*;
import java.util.*;

class program62_1
{
    public static void main(String A[])throws Exception
    {
        int iRet = 0;
        int iCount = 0;

        byte Buffer[] = new byte[1024];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            File fArr[] = fobj.listFiles();

            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                iCount = iCount + iRet;  // count actual bytes read
            }
            fiobj.close();

            System.out.println("total number of bytes in file :"+iCount);
        }
        else
        {
            System.out.println("there is no such a file");
        }
        sobj.close();
    }   
}