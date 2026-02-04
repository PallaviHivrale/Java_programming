// Count total regular files and sub-folders inside a directory

import java.io.*;
import java.util.*;

class program59_4
{
    public static void main(String A[])throws Exception
    {
        int FileCnt = 0, FolderCnt = 0;

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
                    FileCnt++;
                }
                else if(fArr[i].isDirectory())
                {
                    FolderCnt++;
                }
            }
            System.out.println("Total files : " + FileCnt);
            System.out.println("Total folders : " + FolderCnt);
        }
        else
        {
            System.out.println("there is no such a folder");
        }

        sobj.close();
    } 
}