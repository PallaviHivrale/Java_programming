// Write file name + size + data
import java.io.*;
import java.util.*;

class program58_5
{
    public static void main(String A[])throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Folder name :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            FileOutputStream foobj = new FileOutputStream("Marvellous.txt");

            File fArr[] = fobj.listFiles();

            System.out.println("Folder is present");
            System.out.println("number of files in the folder are :"+fArr.length);

            for(int i=0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    String Header = "File name : " + fArr[i].getName()+ " File Size : " + fArr[i].length() + "\n";
                    foobj.write(Header.getBytes());

                    foobj.write(Header.getBytes());

                    System.out.println(Header);

                    FileInputStream fiobj = new FileInputStream(fArr[i]);

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);

                        System.out.print(new String(Buffer, 0, iRet));
                    }
                    foobj.write("\n".getBytes());

                    System.out.println();

                    fiobj.close();
                }
            }
            foobj.close();
            System.out.println("Name ,size and data written");
        }
        else
        {
            System.out.println("there is no such a folder");
        }

        sobj.close();

    }
}