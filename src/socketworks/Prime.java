package socketworks;

import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPrime = true;
        System.out.println("Enter Number : ");
        int number = input.nextInt();
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + ": is Prime");
        }else{
             System.out.println(": is not Prime");
        }
    }
}
