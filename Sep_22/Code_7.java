package Sep_22;

public class Code_7 {
    public static void sum(int a, int b, int c){
        hello();
        int x = 9;
        if(x==9){
            return;
        }
        System.out.println("Calculating sum");
        int add = a+b+c;
        System.out.println("Sum Calculation done");
        System.out.println(add);

    }
    public static void main(String[] args) {
        System.out.println("Calling sum function");
        sum(2,3,5);
    }

    public static void hello(){
        System.out.println("Hello");
    }

}
