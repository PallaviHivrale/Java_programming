// accept file name from user & handle all possible file related exception properly.

import java.io.*;
import java.util.*;

class Program62_5
{
    public static void main(String args[]) throws Exception
    {
        int iRet = 0;
        int iCount = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println(" Enter the file name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(!fobj.exists())
        {
            System.out.println("File does not exist.");
        }
        else if(!fobj.isFile())
        {
            System.out.println("This is not a regular file.");
        }
        else if(!fobj.canRead())
        {
            System.out.println("File cannot be read (permission denied).");
        }
        else
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            System.out.println("Reading file content:");

            // Read file byte by byte
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                System.out.print((char)Buffer[0]);
                iCount += iRet;
            }

            fiobj.close();
            System.out.println("\nTotal bytes read: " + iCount);
        }
        sobj.close();
    }
}    