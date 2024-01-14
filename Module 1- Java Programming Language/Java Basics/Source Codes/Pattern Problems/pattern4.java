/*Solve the following pattern problem 
* * * * * 
  * * * * 
    * * * 
      * *
        *


*/

import java.util.Scanner;

public class pattern4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int height, i, j, k;

        System.out.println("Enter The Height!");
        height = sc.nextInt();

        for (i = 0; i < height; i++) {

            for (j = 0; j < i; j++) {

                if (i == 0)
                    break;
                System.out.print("  ");
            }

            for (k = 0; k < height - i; k++) {

                System.out.print("* ");

            }
            System.out.println();

        }

    }

}
