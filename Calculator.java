

class Calculator{
      
    static void add(int a, int b){
        int c=a+b;
        System.out.println("Addition =>"+c);
    }
    static void sub(int a, int b){
        int c=b-a;
        System.out.println("Substraction =>"+c);
    }
    static void div(int a, int b){
        int c=a*b;
        System.out.println("Multiplication =>"+c);
    }
    static void mult(int a, int b){
        float c=b/a;
        System.out.println("Division =>"+c);
    }

    public static void main(String[] args){
        int a=10,b=20;
        //abc
        add(a,b);
        sub(a,b);
        div(a,b);
        mult(a,b);

    
    }
}