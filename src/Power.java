
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adeleke Oladapo
 */


public class Power {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input values:");
        List lines = new ArrayList();
        String s;
        while((s = in.nextLine()) != null && s.length() > 0){
            lines.add(s);
        }
        
        Iterator itr = lines.iterator();
        
        while(itr.hasNext()){
            Object obj = itr.next();
            String[] arr = obj.toString().split(" ");
            try{
                System.out.println(Math.pow(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
            }catch(Exception e){
                System.err.println(e.toString());
            }
        }
    }
    
}
