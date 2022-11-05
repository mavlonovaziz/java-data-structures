// Java program for the above approach
import java.util.*;

class GFG{

    static int MOD = 998244353;

    // Function to generate a convolution
// array of two given arrays
    static void findConvolution(int[] a,
                                int[] b)
    {

        // Stores the size of arrays
        int n = a.length, m = b.length;

        // Stores the final array
        int[] c = new int[(n + m - 1)];

        // Traverse the two given arrays
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < m; ++j)
            {

                // Update the convolution array
                c[i + j] += (a[i] + b[j]) % MOD;
            }
        }

        // Print the convolution array c[]
        for(int k = 0; k < c.length; ++k)
        {
            c[k] %= MOD;
            System.out.print(c[k] + " ");
        }
    }

    // Driver Code0
    public static void main(String args[])
    {
        int[] A = { 1, 2, 3, 4 };
        int[] B = { 5, 6, 7, 8, 9 };

        findConvolution(A, B);}
}

// This code is contributed by souravghosh0416







