public class EMP1 {
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
    EMP1 e1 = new EMP1();
    System.out.println(e1.hashCode());
    System.out.println(e1);
    EMP1 e2 = e1;
    System.out.println(e2.hashCode());
    System.out.println(e2);
    e2.name="Bhalu";
    System.out.println(e1.name);
    }
}
