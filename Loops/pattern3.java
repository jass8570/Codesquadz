/*
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 
*/

public class pattern3 {
    public static void main(String... s) throws Exception{
        int i,j;
        char alphabet='A';
        System.out.printf("Enter an uppercase character you want to print in last row:");
        int z= System.in.read();
        for(i=1;i<= (z - 'A' +1);++i){
            for(j=1;j<=i;++j){
                System.out.print(alphabet);
                System.out.print(" ");
            }
            ++alphabet;
            System.out.println();
        }
    }
}
