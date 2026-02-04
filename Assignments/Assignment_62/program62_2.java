// accept file name & integer N from user & copy first N byte into new line

import java.io.*;
import java.util.*;

class program62_2
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file name :");
        String FileNameSrc = sobj.nextLine();

        System.out.println("Enter number of bytes to copy:");
        int N = sobj.nextInt();

        File fobj = new File(FileNameSrc);

        if(fobj.exists() && fobj.isFile())
        {
            byte Buffer[] = new byte[N];

            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream("FirstNBytes.txt");

            // Read first N bytes (or less if file is smaller)
            int iRet = fiobj.read(Buffer, 0, N);
            if(iRet > 0)
            {
                foobj.write(Buffer, 0, iRet);
                System.out.println("First " + iRet + " bytes copied to FirstNBytes.txt");
            }
            else
            {
                System.out.println("File is empty. Nothing to copy.");
            }
            
            fiobj.close();
            foobj.close();

        }
        else
        {
            System.out.println("there is no such a file");
        }
        sobj.close();
    }   
}