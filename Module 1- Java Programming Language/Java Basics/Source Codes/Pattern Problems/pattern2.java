/*Solve The Following Pattern Problem 
 * 
 * 
 *                               *
 *                              **
 *                             ***
 *                            ****
 *                           *****


 */

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {

        int height, i, j, k;

        System.out.println("Enter Height!");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();

        for (i = 0; i < height; i++) {

            for (j = 0; j < height - i - 1; j++) {
                System.out.print("  ");
            }

            for (k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
