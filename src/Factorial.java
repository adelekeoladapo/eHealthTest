
public class Factorial {
    
    public static void main(String[] args){
        Factorial test = new Factorial();
        System.out.println(test.fact(5));
    }
    
    int fact(int n){
        if(n <= 1)
            return n;
        else
            return n * fact(n - 1);
    }
    
}
