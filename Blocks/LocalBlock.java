public class LocalBlock {
    public static void main(String[] args) {
        int x=10;
        {
            int y=20;// local block code can't be accesed from outside the blocks
            System.out.println(x+y);

        }
    }
}
