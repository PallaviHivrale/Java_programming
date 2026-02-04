// Check path exists and whether file or directory

import java.io.*;   
import java.util.*;

class program60_5
{
    public static void main(String[] args)
    {   
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the path :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists())
        {
            System.out.println("Path exists");

            if(fobj.isFile())
            {
                System.out.println("It is a file");
            }
            else if(fobj.isDirectory())
            {
                System.out.println("It is a directory");
            }
        }
        else
        {
            System.out.println("Path does not exist");
        }

        sobj.close();
    }
}
