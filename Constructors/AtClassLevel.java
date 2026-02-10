public class AtClassLevel {
    int x=10;
    int y=20;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        AtClassLevel l1=new AtClassLevel();
        l1.show();
        AtClassLevel l2=new AtClassLevel();
        l2.show();
    }
}
