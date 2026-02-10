/*

* * * * * 
* * * * 
* * * 
* * 
* 

*/

public class pattern4 {
     public static void main(String... s) throws Exception {
        int i,j,rows;
        System.out.print("Enter the number of rows:");
        rows= new java.util.Scanner(System.in).nextInt();
        for (i=rows;i>=1;--i) {
            for(j=1;j<=i;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
