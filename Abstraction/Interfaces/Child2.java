interface INSTANCE {
    default void show(){
        System.out.println("Instance");
    }
}
interface INSTANCE1 {
    default void show(){
        System.out.println("Instance 1");
    }
}
class MyRegister {
    void register(INSTANCE I){
        I.show();
    }
}
public class Child2 implements INSTANCE,INSTANCE1 {
    public void show(){
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        MyRegister m1 = new MyRegister();
        m1.register(c2);
        INSTANCE I1 = new Child2();
        I1.show();

        INSTANCE1 I2 = new Child2();
        I2.show();
    }
}