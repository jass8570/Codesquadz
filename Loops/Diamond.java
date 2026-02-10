/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/





public class Diamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
