import java.util.Scanner;

public class ClassLevelArray {
    // int z[]= new int[10];
    // int z[]= { 10,20,30};
    int z[];
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        int x = new Scanner(System.in).nextInt();
        ClassLevelArray o = new ClassLevelArray();
        o.z = new int[x];
        for(int i=0;i<o.z.length;i++){
            o.z[i] = new Scanner(System.in).nextInt();
        }

        for(int i=0;i<o.z.length;i++){
            System.out.print(o.z[i]);
            System.out.print("    ");
        }
        System.out.println();
        for(int s: o.z){
            System.out.print(s);
            System.out.print("    ");
        }
    }
    
}
