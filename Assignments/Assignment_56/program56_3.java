// Program 3: Accept a file name and append data to it

import java.io.*;
import java.util.*;

class program56_3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileWriter fwobj = new FileWriter(fobj, true); // 'true' for append mode
            fwobj.write("Jay Ganesh...");
            fwobj.close();
            System.out.println("Data written successfully");
        }
        else
        {
            System.out.println("File does not exist");
        }

        sobj.close();
    }
}
