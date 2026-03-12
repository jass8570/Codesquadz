
import java.util.Scanner;

public class CLA {
    public static void main(String[] args) {
        int z[];
        System.out.print("Enter the size of the array: ");
        int x = new Scanner(System.in).nextInt();
        z= new int[x];
        System.out.println("Enter the elements: ");
        for(int i=0;i<z.length;i++){
            z[i]= new Scanner(System.in).nextInt();
        }
        for(int i=0;i<z.length;i++){
            System.out.print(z[i]);
            System.out.print("    ");
        }
    }
}
