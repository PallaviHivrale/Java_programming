import java.util.Scanner;

class Logical_Operators
{
    public static void main(String A[])
    {
        int p = 15, q = 10, r = 5;

        // && operator
        System.out.println((p > q) && (p > r)); // True
        System.out.println((p > q) && (p < r)); // false 

        // || operator
        System.out.println((r < q) || (p < q)); // True
        System.out.println((p > q) || (q > r)); //  True
        System.out.println((p < q) && (q < r)); // false

        // ! operator
        System.out.println(!(p == q)); // true
        System.out.println(!(p > q)); //  false
    }
}