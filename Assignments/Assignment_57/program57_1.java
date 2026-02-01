// Program to accept two file names and copy data from source file to destination file

import java.io.*;
import java.util.*;

class program57_1
{
    public static void main(String A[])throws Exception
    {
        int iRet = 0;

        File fobjsrc = null;
        File fobjdest = null;

        String FileNameSrc = null;
        String FileNameDest = null;

        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file :");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of Destination file :");
        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            fobjdest = new File(FileNameDest);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }
            System.out.println("File copy sucessfully\n");

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("there is no source file");
        }

        sobj.close();
    }
}