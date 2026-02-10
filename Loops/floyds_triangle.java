/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
*/


public class floyds_triangle {
    public static void main(String... s) {
        int rows,i,j,number=1;
        System.out.printf("Enter the number of rows:");
        rows=new java.util.Scanner(System.in).nextInt();
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;++j){
                System.out.printf("%d ",number);
                ++number;
            }
            System.out.printf("\n");
        }
        
    }
    
}

