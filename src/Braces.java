
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Adeleke Oladapo
 */


public class Braces {
    
    public static void main(String[] args){
        Braces braces = new Braces();
        Scanner in = new Scanner(System.in);
        
//        System.out.print("Enter string: ");
//        String str = in.next();
//        System.out.println(braces.CheckParentesis(str));
        braces.test();
    }
    
    public static boolean CheckParentesis(String str){
        if (str.isEmpty())
            return true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            
            if (current == '{' || current == '(' || current == '['){
                stack.push(current);
            }

            if (current == '}' || current == ')' || current == ']'){
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else 
                    return false;
            }

        }

        return stack.isEmpty();
    }
    
    void test(){
        double d = 1 / 2;
        System.out.println(d);
    }
    
}
