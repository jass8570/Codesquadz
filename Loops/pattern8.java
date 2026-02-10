/*

* * * * * * * * * * * * * 
  * * * * * * * * * * * 
    * * * * * * * * * 
      * * * * * * * 
        * * * * * 
          * * * 
            * 

*/



public class pattern8 {
    public static void main(String... s) throws java.io.IOException{
        int rows,i,j,space;
        System.out.printf("Enter the number of rows:");
        rows=new java.util.Scanner(System.in).nextInt();
        for(i=rows;i>=1;--i){
            for(space=0;space<rows-i;++space)
            System.out.printf("  ");
            for(j=i;j<=2*i-1;++j)
            System.out.printf("* ");
            for(j=0;j<i-1;++j)
            System.out.printf("* ");
            System.out.printf("\n");
        } 
        
    }
}
