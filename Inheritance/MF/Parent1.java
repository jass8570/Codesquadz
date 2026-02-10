class Parent1 {
    void show(){
        System.out.println("Parent Class");
    }
}
class child1 extends Parent1{
    void show(){
        System.out.println("Child Class");
        super.show();
    }
    public static void main(String[] args) {
        child1 c= new child1();
        c.show();
    }
}