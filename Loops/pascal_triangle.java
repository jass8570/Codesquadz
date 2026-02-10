
/*

               1
             1   1
           1   2   1
         1   3   3   1
       1   4   6   4   1
     1   5  10  10   5   1
     
*/

public class pascal_triangle {
    public static void main(String... s) {
        int i,j,rows,coef=1,space;
        System.out.printf("Enter the number of rows:");
        rows=new java.util.Scanner(System.in).nextInt();
        for(i=0;i<rows;i++){
            for(space=1;space<=rows-i;space++)
            System.out.printf("  ");
            for(j=0;j<=i;j++){
                if(j==0 || i==0)
                coef=1;
                else
                coef=coef*(i-j+1)/j;
                System.out.printf("%4d",coef);
            }
            System.out.printf("\n");
        }
        
    }
}
