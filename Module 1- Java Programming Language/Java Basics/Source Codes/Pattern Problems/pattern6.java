/*Solve The Following Pattern  


* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

*/

import java.util.Scanner;

public class pattern6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Height ");
        int height = sc.nextInt();
        int i, j, k, l, m;
        for (i = 1; i <= height; i++) {
            for (l = 0; l < i; l++)
                System.out.print("  ");
            for (j = 0; j <= height - i; j++)
                System.out.print("* ");
            for (k = 0; k < height - i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }

}
