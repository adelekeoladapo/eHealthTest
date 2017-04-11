package shobbu.com;

public class Fibonacci {
    
    public static void main(String[] args){
        Fibonacci test = new Fibonacci();
        System.out.println(test.fib(6));
    }
    
    int fib(int n){
        if(n <= 1){
            return n;
        }else{
            return fib(n - 2) + fib(n - 1);
        }
    }
    
}
