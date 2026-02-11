public class Parent3 {
    A show(){
        System.out.println("Parent class");
        return new A();
    }
}
class Child3 extends Parent3{
    B show(){
        System.out.println("Child class");
        return new B();
    }
    public static void main(String[] args) {
        Child3 c3= new Child3();
        c3.show();
    }
}
class A{

}

class B extends A{

}
