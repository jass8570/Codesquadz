public class Parent4 {
    int x=10;
    void show(){
        System.out.println("Base");
    }
}

class Child4 extends Parent4{
    int x=50;
    void show(){
        System.out.println("Child");
        super.show();
    }
    void display(){
        System.out.println("Display");

    }
    public static void main(String[] args) {
        Parent4 P = new Child4();
        P.show();

        Child4 C=(Child4)P;
        C.display();
        System.out.println(P.x);
        System.out.println(C.x);
    }
}
