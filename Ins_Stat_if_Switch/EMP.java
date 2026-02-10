class EMP {
    static String cname="TCS";
    String name;
    int salary;
void get(String s1, int s2){
    name=s1;
    salary=s2;

    }
void show(){
    System.out.println(cname);
    System.out.println(name);
    System.out.println(salary);
}    
static int add(int a, int b){
    return a+b;
}
public static void main(String s[]) {
    EMP e1 = new EMP();
    e1.get("lalu",2002);
    e1.show();
    int z = EMP.add(20,20);
    System.out.println(z);
    z=add(10,30);
    System.out.println(z);
}
}
class Demo{
    public static void main(String s[]) {
        EMP e2 = new EMP();
        e2.get("Rabri",51);
        e2.show();
        int z=EMP.add(30,40);
        System.err.println(z);
        
    }

}