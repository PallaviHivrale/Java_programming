// Display files with given extension

import java.io.*;   
import java.util.*;

class program60_4
{
    public static void main(String[] args)
    {   
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the folder Name :");
        String FolderName = sobj.nextLine();

        System.out.println("Enter the extension :");
        String Ext = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(int i = 0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    if(fArr[i].getName().endsWith(Ext))
                    {
                        System.out.println(fArr[i].getName());
                    }
                }
                
            }
        }
        else
        {
            System.out.println("there is no such a file");

        }
        sobj.close();
    }
}