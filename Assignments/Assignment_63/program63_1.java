// Copy file using BufferedInputStream and BufferedOutputStream

import java.io.*;
import java.util.*;

class Program63_1
{
    public static void main(String args[]) throws Exception
    {
        int iRet = 0;
        int TotalBytes = 0;

        Scanner sobj = new Scanner(System.in);

        byte Buffer[] = new byte[1024];

        System.out.println("Enter source file name:");
        String SrcFile = sobj.nextLine();

        System.out.println("Enter destination file name:");
        String DestFile = sobj.nextLine();

        File fobj = new File(SrcFile);

        if(fobj.exists() && fobj.isFile())
        {
            BufferedInputStream biobj = new BufferedInputStream(new FileInputStream(fobj));
            BufferedOutputStream boobj = new BufferedOutputStream(new FileOutputStream(DestFile));

            while((iRet = biobj.read(Buffer)) != -1)
            {
                boobj.write(Buffer, 0, iRet);
                TotalBytes = TotalBytes + iRet;
            }
            biobj.close();
            boobj.close();

            System.out.println("File copied successfully using buffered streams.");
            System.out.println("Total bytes copied: " + TotalBytes);

        }
        sobj.close();
    }
}
