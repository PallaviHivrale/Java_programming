// Create Combined.bin from all files in a directory

import java.io.*;
import java.util.*;

class Program63_4
{
    public static void main(String args[]) throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name:");
        String DirName = sobj.nextLine();

        File dir = new File(DirName);

        if(dir.exists() && dir.isDirectory())
        {
            File fArr[] = dir.listFiles();

            BufferedOutputStream boobj = new BufferedOutputStream(new FileOutputStream("Combined.bin"));

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    BufferedInputStream biobj = new BufferedInputStream(new FileInputStream(fArr[i]));

                    while((iRet = biobj.read(Buffer)) != -1)
                    {
                        boobj.write(Buffer, 0, iRet);
                    }

                    biobj.close();
                }
            }
            boobj.close();

            System.out.println("Combined.bin created successfully with all files' data");
        }
        else
        {
            System.out.println("there is no such a file");
        }
        sobj.close();
    }
}
