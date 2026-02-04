// Display file name with absolute path

import java.io.*;
import java.util.*;

class program59_5
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the FolderName :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(int i = 0; i < fArr.length; i++) 
            {
                if(fArr[i].isFile())
                {
                    System.out.println("File Name:"+fArr[i].getName()+fArr[i].getAbsolutePath());
                System.out.println();
                }
            }
        }
        else
        {
            System.out.println("there is no such a folder");
        }

        sobj.close();
    } 
}