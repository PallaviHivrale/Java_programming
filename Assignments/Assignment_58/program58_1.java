// List and display only file names from a given directory entered by the user

import java.io.*;
import java.util.*;

class program58_1
{
    public static void main(String A[])
    { 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())   //  only regular files
                {
                    System.out.println("File name :"+fArr[i].getName()+" File Size :"+fArr[i].length()+" bytes");
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
