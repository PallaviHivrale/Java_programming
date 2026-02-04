// Write all file names into Marvellous.txt

import java.io.*;
import java.util.*;

class program58_2
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name :");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File fArr[] = fobj.listFiles();

            FileOutputStream foobj = new FileOutputStream("Marvellous.txt");

            for(int i=0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    String FileName = fArr[i].getName()+"\n";

                    System.out.println("File Name: " + FileName);

                    byte Buffer [] = FileName.getBytes();

                    foobj.write(Buffer);
                }
            }
            foobj.close();
            System.out.println("All file names written into Marvellous.txt");

        }
        else
        {
            System.out.println("there is no such a folder");
        }

        sobj.close();

    }
}