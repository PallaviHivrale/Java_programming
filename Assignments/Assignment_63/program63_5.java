// Read first 1 KB from Combined.bin and write to new file

import java.io.*;
import java.util.*;

class Program63_5
{
    public static void main(String args[]) throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter output file name:");
        String OutFile = sobj.nextLine();

        File fobj = new File("Combined.bin");

        if(fobj.exists() && fobj.isFile())
        {
            BufferedInputStream biobj = new BufferedInputStream(new FileInputStream(fobj));
            BufferedOutputStream boobj = new BufferedOutputStream(new FileOutputStream(OutFile));

            iRet = biobj.read(Buffer); // read only first 1 KB
            
            if(iRet != -1)
            {
                boobj.write(Buffer,0,iRet);
            }
            biobj.close();
            boobj.close();

            System.out.println("First 1 KB of Combined.bin written to " + OutFile);
        }
        else
        {
            System.out.println("there is no such a file");
        }
        sobj.close();
    }
}
