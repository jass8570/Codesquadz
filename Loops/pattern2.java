/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/


public class pattern2 {
    public static void main(String[] args) {
        int i,j,rows;
        System.out.print("Enter the number of rows:");
        rows= new java.util.Scanner(System.in).nextInt();
        for (i=1;i<=rows;++i) {
            for(j=1;j<=i;++j){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
