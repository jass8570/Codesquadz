/*

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

*/


public class pattern6 {
    public static void main(String... s) {
        int i=1,space,rows,k=0;
        System.out.print("Enter the number of rows:");
        rows = new java.util.Scanner(System.in).nextInt();
        for(i=1;i<=rows;++i,k=0)
        {
            for(space=1;space<=rows-i;++space)
        {
            System.out.print("  ");
        }
        while (k!=2*i-1) {
            System.out.print("* ");
            ++k;
            
        }
        System.out.println();

        
    }
}
}
