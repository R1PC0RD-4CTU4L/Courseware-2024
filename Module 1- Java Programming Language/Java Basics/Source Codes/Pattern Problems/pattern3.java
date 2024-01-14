/*Solve The Following Pattern Problem 
 * 
 *                              ******
 *                              *****
 *                              ****
 *                              ***
 *                              **
 *                              *


 */

import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args) {

        System.out.println("Enter the height");
        int height, i, j;
        Scanner sc = new Scanner(System.in);

        height = sc.nextInt();

        for (i = 0; i < height; i++) {
            for (j = 0; j < height - i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
