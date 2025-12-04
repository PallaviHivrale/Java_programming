////////////////////////////////////////////////////////////////////////
//
//  Function Name : Pattern
//  Description : This program displays ASCII characters 
//                with their decimal, hex, and octal values.
//  Input :   void
//  Output :                
//
//  Author : Pallavi Kishanrao Hivrale
//  Date :   4/12/25
//
////////////////////////////////////////////////////////////////////////
class StringX
{ 

    public void displayASCII()
    {
        System.out.println("Symbol\tDecimal\tHexaDecimal\tOctal");

        for (int i = 0; i <= 255; i++)
        {
            char symbol = (char) i;
            System.out.printf("%c\t%d\t%X\t%o\n", symbol, i, i, i);
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////

public class program34_1
{
    public static void main(String[] args)
    {
        StringX strobj = new StringX();
        strobj.displayASCII();   // Now matches the method name
    }
}