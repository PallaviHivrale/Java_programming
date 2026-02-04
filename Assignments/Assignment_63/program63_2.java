// Copy file using normal streams and buffered streams, display time

import java.io.*;
import java.util.*;

class Program63_2
{
    public static void main(String args[]) throws Exception
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        byte Buffer[] = new byte[1024];

        System.out.println("Enter source file name:");
        String SrcFile = sobj.nextLine();

        System.out.println("Enter destination file name for normal stream :");
        String DestNormal = sobj.nextLine();

        System.out.println("Enter destination file name for buffered streams:");
        String DestBuffered = sobj.nextLine();

        File fobj = new File(SrcFile);

        if(fobj.exists() && fobj.isFile())
        {
            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream(DestNormal);

            long startTime = System.currentTimeMillis();  // start time for normal copy
            while((iRet = fiobj.read(Buffer)) != -1)    //read bytes into buffer
            {
                foobj.write(Buffer, 0, iRet);       // write bytes to destination
            }
            long endTime = System.currentTimeMillis(); // end time

            fiobj.close();
            foobj.close();

            System.out.println("Normal stream copy done. Time taken: " + (endTime - startTime) + " ms");

            // ---------- Buffered stream copy ----------

            BufferedInputStream biobj = new BufferedInputStream(new FileInputStream(fobj));
            BufferedOutputStream boobj = new BufferedOutputStream(new FileOutputStream(DestBuffered));

            startTime = System.currentTimeMillis(); // start time for buffered copy
            while((iRet = biobj.read(Buffer)) != -1) // read bytes into buffer
            {
                boobj.write(Buffer, 0, iRet);   // write bytes to destination
            }
            endTime = System.currentTimeMillis(); // end time

            biobj.close();
            boobj.close();

            System.out.println("Buffered stream copy done. Time taken: " + (endTime - startTime) + " ms");

        }
        else
        {
            System.out.println("there is no such a file");
        }
        sobj.close();
    }
}

/*
Normal stream → slower because it reads/writes bytes directly without buffering.

Buffered stream → faster because it reads/writes in chunks using an internal buffer.
 */
