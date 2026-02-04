// Split file into two parts

import java.io.*;
import java.util.*;

class program61_5
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int FullSize = 0;
        int HalfSize = 0;

        byte Buffer[] = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the File name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        
        if(fobj.exists() && fobj.isFile())
        {
            FullSize = (int)fobj.length();
            Buffer = new byte[FullSize];

            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj1 = new FileOutputStream("Part1.txt");
            FileOutputStream foobj2 = new FileOutputStream("Part2.txt");

            // read the file
            if((iRet = fiobj.read(Buffer)) != -1)
            {
                HalfSize = iRet / 2;

                foobj1.write(Buffer, 0, HalfSize);
                foobj2.write(Buffer, HalfSize, iRet - HalfSize);
            }

            System.out.println("File splitted successfully");

            fiobj.close();
            foobj1.close();
            foobj2.close();
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}
