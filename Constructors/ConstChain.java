public class ConstChain {
    ConstChain(){
        this(10);
        System.out.println("Default");
    }
    ConstChain(int x){
        this(10,20);
        System.out.println(x);
    }
    ConstChain(int x,int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        new ConstChain();
    }
}
