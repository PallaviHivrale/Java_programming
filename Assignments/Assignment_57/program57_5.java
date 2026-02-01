// Program accept directory name from user &  create directory
import java.io.*;
import java.util.*;

class program57_5
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name :");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            System.out.println("Number of files : " + fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("File Name : " + fArr[i].getName() +
                                   " | File Size : " + fArr[i].length() + " bytes");
            }
        }
        else
        {
           System.out.println("Directory does not exist"); 
        }

        sobj.close();
    }
}