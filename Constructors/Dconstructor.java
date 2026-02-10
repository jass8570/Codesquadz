public class Dconstructor {
    int x;
    int y;

    Dconstructor() {
        x = 10;
        y = 20;

    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Dconstructor d1 = new Dconstructor();
        d1.show();
        Dconstructor d2 = new Dconstructor();
        d2.show();
    }
}
