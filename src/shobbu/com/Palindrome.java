package shobbu.com;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    
    public static void main(String[] args){
        Palindrome pal = new Palindrome(); 
        System.out.println(pal.count_unique_palindromes("Step on no pets"));
    }
    
    int count_unique_palindromes(String str){
        List<String> found = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = (i+2); j <= str.length(); j++){
                String s = str.substring(i, j);
                if(is_palindrome(s) && !found.contains(s))
                    found.add(s);
            }
        }
        return found.size();
    }
    
    boolean is_palindrome(String str){
        return (new StringBuilder(str).reverse().toString().equalsIgnoreCase(str)) ? true : false;
    }
    
}
