public class FinalArray {
    public static void main(String[] args) {
        final int z[]={1,2,3,4,5}; // we make the data member final but the values could be change...
        System.out.println(z[0]);
        z[0]=12;
        System.out.println(z[0]);
        int y[]={100,200,300,400};
        // z=y;  // after making final this is not allowed
        System.out.println(z[0]);
    }
}
