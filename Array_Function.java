/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array_function;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Array_Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int C []= new int[5];
        Input(C);
        Display(C);
    }
    public static void Display(int []A)
    {
        System.out.printf("The Elements of the Input Array are\n\t");
        for (int x= 0;x<A.length; x++) {
            System.out.printf("%d \t",A[x]);
        }
    }
     public static void Input(int []B)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the elements of the Array\n");
        for (int x= 0; x<B.length ;x++) {
            B[x]=input.nextInt();
        }
    }
}
