package D24A3;

public class Calculator {
    int n1;
    int n2;

    public Calculator(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public Calculator(){

    }

    public void add(int x, int y){
        System.out.println(x + y);
    }

    public void add(){
        System.out.println(n1 + n2);
    }

    public void subtract(int x, int y){
        System.out.println(x - y);
    }

    public void multiply(int x , int y){
        System.out.println(x * y);
    }

    public void divide(int x, int y){
        if (y==0) return;
        System.out.println(x / y);
    }

    public void modulus(int x, int y){
        System.out.println(x % y);
    }
}
