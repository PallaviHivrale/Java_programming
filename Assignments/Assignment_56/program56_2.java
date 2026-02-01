// Program to accept file name, open file and display contents

import java.io.*;
import java.util.*;

class program56_2
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        String FileName = null;

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Buffer[] = new byte[100];
            
            System.out.println("File opened successfully");
            System.out.println("File contents are :");

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                System.out.print(new String(Buffer,0,iRet));
            }

            fiobj.close();
        }
        else
        {
            System.out.println("File does not exist");
        }

        sobj.close();
    }
}
