/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package print_an_array;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Print_an_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
       int X[]= new int[5];
        Scanner Read = new Scanner(System.in);
        for (int a= 0; a<X.length ; a++) {
            X[a]=Read.nextInt();
        }
        for (int a = 0; a<X.length; a++) {
            System.out.println(X[a]);
        }
      
      
    }
}
