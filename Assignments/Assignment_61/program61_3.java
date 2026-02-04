// Append string at end of file

import java.io.*;
import java.util.*;

class program61_3
{
    public static void main(String A[])throws Exception
    {
        File fobj = null;
        String FileName = null;
        String Buffer = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the  File name :");
        FileName = sobj.nextLine();

        System.out.println("Enter the string to append :");
        Buffer = sobj.nextLine();

        fobj = new File(FileName);

        if((fobj.exists()) && (fobj.isFile()))
        {
            FileOutputStream foobj = new FileOutputStream(fobj, true); //true means append mode, data is added at end, not overwritten

            foobj.write(Buffer.getBytes());

            System.out.println("Data appended successfully");

            foobj.close();
        }
        else
        {
            System.out.println("there is no such a file");
        }
        sobj.close();
    }
}