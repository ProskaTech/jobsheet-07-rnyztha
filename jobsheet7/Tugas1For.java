
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class Tugas1For {
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter nama : ");
        String nama = in.nextLine();

        int i = 0;
        while(i <= 10){
            System.out.println(i +". "+ nama);
            i++;
        }
    }
    
}
