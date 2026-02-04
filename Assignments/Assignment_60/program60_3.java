// Display name of Smallest file from directory

import java.io.*;   
import java.util.*;

class program60_3
{
    public static void main(String[] args)
    {
        // Start with the biggest possible long value
        // so that any file size will be smaller than this at first
        long MinSize = Long.MAX_VALUE;

        String MinFileName = ""; // string is empty 
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the folder Name :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(int i = 0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    {
                        if(fArr[i].length() <  MinSize)
                        {
                            MinSize = fArr[i].length();
                            MinFileName = fArr[i].getName();
                        }
                    }
                }
            }
            System.out.println("smallest file is : " + MinFileName);
            System.out.println("Size : " + MinSize + " bytes");
        }
        else
        {
            System.out.println("there is no such a file");

        }
        sobj.close();
    }
}