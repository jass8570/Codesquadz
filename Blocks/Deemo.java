public class Deemo {
    static Temp11 d;
    static{
        d=new Temp11();
    }
}

class Temp11 {
    void show(int x){
        System.out.println(x);
    }
}


class Temp21 {
    public static void main(String[] args) {
        Deemo.d.show(20);
    }
    
}