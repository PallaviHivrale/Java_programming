// Create a backup copy of it with name original_backup.txt

import java.io.*;
import java.util.*;

class Program62_4
{
    public static void main(String args[]) throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println(" Enter file name to backup :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream("original_backup.txt");

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            fiobj.close();
            foobj.close();

            System.out.println("Backup created as original_backup.txt");
        }
        else
        {
            System.out.println("File not found");
        }

        sobj.close();
    }
}
