interface My {
    void show();   
}
interface My1 extends My{
    void get();
} 
interface My2 extends My1{
    void xyz();
}
class Child implements My2{
    public void show(){
        System.out.println("Show");
    }
    public void get(){
        System.out.println("Get function");

    }
    public void xyz(){
        System.out.println("xyz");
    }
    public static void main(String[] args) {
        My m= new Child();
        m.show();
        My1 m1 = new Child();
        m1.show();
        m1.get();
        My2 m2= new Child();
        m2.show();
        m2.get();
        m2.xyz();
    }
}