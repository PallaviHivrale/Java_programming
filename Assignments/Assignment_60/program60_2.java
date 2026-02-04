// Display name of largest file from directory

import java.io.*;   
import java.util.*;

class program60_2
{
    public static void main(String[] args)
    {
        long MaxSize = 0;
        String MaxFileName = "";
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
                        if(fArr[i].length() > MaxSize)
                        {
                            MaxSize = fArr[i].length();
                            MaxFileName = fArr[i].getName();
                        }
                    }
                }
            }
            System.out.println("Largest file is : " + MaxFileName);
            System.out.println("Size : " + MaxSize + " bytes");
        }
        else
        {
            System.out.println("there is no such a file");

        }
        sobj.close();
    }
}