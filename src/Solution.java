
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

// MCM_:

/* Fes un programa que llegeixi dos nombres enters positius i escrigui el seu mínim comú múltiple. El MCM és el nombre enter positiu múltiple d'ambdós més petit.

Per més informació sobre MCM: MCM

Input Format

Introdueix dos nombres enters positius

Constraints

No n'hi ha.

Output Format

Imprimeix el MCM dels dos nombres.

Sample Input 0

20 30
Sample Output 0

60
Sample Input 1

20 1
Sample Output 1

20
Sample Input 2

17 13
Sample Output 2

221

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mcm = 1;
        int i = 0;

        if (num1 > num2)
        {
            i = num1;
        }
        else
        {
            i = num2;
        }

        boolean x = false;
        for (; ! x; i++)
        {
            if (i % num2 == 0 && i % num1 == 0)
            {
                x = true;
                mcm = i;
            }
        }
        System.out.println(mcm);
    }
}
