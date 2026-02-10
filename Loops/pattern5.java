/*

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/


public class pattern5 {
    public static void main(String[] args) {
        int i,j,rows;
        System.out.print("Enter the number of rows:");
        rows= new java.util.Scanner(System.in).nextInt();
        for (i=rows;i>=1;--i) {
            for(j=1;j<=i;++j){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
