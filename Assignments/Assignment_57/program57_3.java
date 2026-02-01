// Program accept directory name from user &  create directory
import java.io.*;
import java.util.*;

class program57_3
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name :");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists())
        {
            System.out.println("Directory created successfully");
        }
        else
        {
           System.out.println("Unable to create directory"); 
        }

        sobj.close();
    }
}