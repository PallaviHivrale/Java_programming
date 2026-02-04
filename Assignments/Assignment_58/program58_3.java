// Write data of all files into Marvellous.txt

import java.io.*;
import java.util.*;

class program58_3
{
    public static void main(String A[])throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Folder name :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            FileOutputStream foobj = new FileOutputStream("Marvellous.txt");

            File fArr[] = fobj.listFiles();

            System.out.println("Folder is present");
            System.out.println("number of files in the folder are :"+fArr.length);

            for(int i=0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    FileInputStream fiobj = new FileInputStream(fArr[i]);

                    System.out.println("File name :"+fArr[i].getName());

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }
                    fiobj.close();
                    
                }
            }
            foobj.close();
            System.out.println("All file data written into Marvellous.txt");
        }
        else
        {
            System.out.println("there is no such a folder");
        }

        sobj.close();

    }
}