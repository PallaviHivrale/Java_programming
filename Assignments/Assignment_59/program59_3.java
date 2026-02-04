// Program: Display only sub-folders inside a given directory
import java.io.*;
import java.util.*;

class program59_3
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
                if(fArr[i].isDirectory())
                {
                    System.out.println(fArr[i].getName());
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