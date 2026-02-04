// Merge two files into output file

import java.io.*;
import java.util.*;

class program61_4
{
    public static void main(String A[])throws Exception
    {
        int iRet = 0;

        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first File :");
        String File1 = sobj.nextLine();

        System.out.println("Enter the second File :");
        String File2 = sobj.nextLine();

        System.out.println("Enter the output :");
        String Out  = sobj.nextLine();

        File fobj1 = new File(File1);
        File fobj2 = new File(File2);
        File fobjOut = new File(Out);

        if((fobj1.exists() && fobj1.isFile()) && (fobj2.exists() && fobj2.isFile()))
        {
            FileInputStream fiobj1 = new FileInputStream(fobj1);
            FileInputStream fiobj2 = new FileInputStream(fobj2);

            FileOutputStream foobj = new FileOutputStream(fobjOut);

            while((iRet = fiobj1.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            while((iRet = fiobj2.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }
            System.out.println("Files merged successfully");

            fiobj1.close();
            fiobj2.close();
            foobj.close();
        }
        else
        {
            System.out.println("there is no such a file");
        }
        sobj.close();
    }
}