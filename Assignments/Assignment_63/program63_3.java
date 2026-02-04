// Copy all files from source directory to destination directory

import java.io.*;
import java.util.*;

class Program63_3
{
    public static void main(String args[]) throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source directory name:");
        String SrcDir = sobj.nextLine();

        System.out.println("Enter destination directory name:");
        String DestDir = sobj.nextLine();

        File src = new File(SrcDir);
        File dest = new File(DestDir);

        if(src.exists() && src.isDirectory())
        {
            File fArr[] = src.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    BufferedInputStream biobj = new BufferedInputStream(new FileInputStream(fArr[i]));
                    BufferedOutputStream boobj = new BufferedOutputStream(new FileOutputStream(new File(dest, fArr[i].getName())));

                    while((iRet = biobj.read(Buffer)) != -1)
                    {
                        boobj.write(Buffer, 0, iRet);
                    }

                    biobj.close();
                    boobj.close();
                }
            }
            System.out.println("All files copied from source to destination directory successfully");
        }
        else
        {
            System.out.println("there is no such a file");
        }
        sobj.close();
    }
}
