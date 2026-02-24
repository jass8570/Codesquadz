abstract class Base {
    int x;
    int y;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    abstract void display();
}

class MyRegister{
    void register(Base b){
        b.display();
    }
}

class Child extends Base{
    void get(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        Child c = new Child();
        MyRegister m = new MyRegister();
        m.register(c);
    }
}