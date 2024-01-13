/*Solve The Following Pattern Problem 
 * 
 *                              * 
 *                              **
 *                              ***
 *                              ****
 *                              *****


 */

import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {

        System.out.println("Enter the height!");
        int height;
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();

        int i, j;

        for (i = 0; i < height; i++) {
            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
