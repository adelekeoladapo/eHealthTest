package shobbu.com;

import java.math.BigInteger;

public class Fibonacci {
    
    public static void main(String[] args){
        Fibonacci test = new Fibonacci();
        System.out.println(test.fib2(600));
    }
    
    /** Recursion **/
    int fib(int n){
        if(n <= 1){
            return n;
        }else{
            return fib(n - 2) + fib(n - 1);
        }
    }
    
    /** Iteration **/
    BigInteger fib2(int n){ 
        BigInteger a, b, c = BigInteger.ZERO;
        a = b = BigInteger.ONE;
        if(n <= 2)
            return BigInteger.ONE;
        else{
            for(int i = 2; i < n; i++){
                c = a.add(b);
                a = b;
                b = c;
            }
        }
        return c;
    }
    
}
