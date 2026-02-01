// Accept file name and check whether it is a regular file or not

import java.io.*;
import java.util.*;

class program57_2
{
    public static void main(String A[])throws Exception
    {
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();


        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("it is a regular file");
        }
        else
        {
            System.out.println("it is not a regular file");
        }

        sobj.close();
    }
}