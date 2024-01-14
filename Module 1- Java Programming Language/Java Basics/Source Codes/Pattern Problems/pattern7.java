/*Solve The Following Pattern Problem 
 * 
 * 
 *                               *
 *                              ***
 *                             *****
 *                            *******
 *                           *********
 *                            *******
 *                             *****
 *                              ***
 *                               *
 *  
 * 
 */

import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height!");
        int height = sc.nextInt();

        int i, j, k, l;

        for (i = 0; i < height; i++) {

            for (j = 0; j < height - i - 1; j++) {

                System.out.print("  ");

            }

            for (k = 0; k <= i; k++) {

                System.out.print("* ");
            }
            for (l = 0; l < i; l++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 1; i <= height - 1; i++) {
            for (l = 0; l < i; l++)
                System.out.print("  ");
            for (j = 0; j <= height - 1 - i; j++)
                System.out.print("* ");
            for (k = 0; k < height - 1 - i; k++)
                System.out.print("* ");
            System.out.println();
        }

    }

}
