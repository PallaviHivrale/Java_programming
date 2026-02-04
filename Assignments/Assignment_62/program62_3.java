// copy last N byte into a new file

import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file name:");
        String SourceFile = sobj.nextLine();

        System.out.println("Enter number of bytes to copy from end:");
        int N = sobj.nextInt();

        File fobj = new File(SourceFile);

        if(fobj.exists() && fobj.isFile())
        {
            long FileSize = fobj.length();

            if(N > FileSize)  // if N is greater than file size
            {
                N = (int)FileSize;
            }

            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream("LastNBytes.txt");

            int iCount = 0;
            int iRet = 0;
            byte Buffer[] = new byte[1]; // read 1 byte at a time

            // Skip first (FileSize - N) bytes
            while(iCount < FileSize - N && (iRet = fiobj.read(Buffer)) != -1)
            {
                iCount += iRet;
            }

            // Now read remaining N bytes and write to new file
            iCount = 0; // reset counter for bytes copied
            while(iCount < N && (iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
                iCount += iRet;
            }

            fiobj.close();
            foobj.close();

            System.out.println("Last " + iCount + " bytes copied to LastNBytes.txt");
        }
        else
        {
            System.out.println("File not found");
        }

        sobj.close();
    }
}
