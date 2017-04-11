import java.util.*;
import java.io.*;
public class Similarity {
    
    public static void main(String[] args) throws FileNotFoundException {
        File input_file = new File("input.txt");
        Scanner in = new Scanner(input_file);
        
        Similarity simi = new Similarity();
        
        int t = Integer.parseInt(in.nextLine());
        for(int i = 0; i < t; i++){
          String line = in.nextLine();
          System.out.println(simi.getSuffixSimilarity(line));
        }
    }
  
    int getSimilarity(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int c = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i))
                c++;
            else
                break;
        }
        return c;
    }
    
    int getSuffixSimilarity(String str){
        int ans = 0;
        for(int i = 0; i < str.length(); i++){
            ans += getSimilarity(str.substring(i), str);
        }
        return ans;
    }
  
}