
import java.util.Arrays;


public class Solution {
    
    public static void main(String[] args){
        
        Solution s = new Solution();
        
        String a = "Adeleke";
        
        String b = "Oladapo";
        
        System.out.println("#2. Characters in strings 'Adeleke' and 'Oladapo' : "+s.find_chars(a, b));
        
        int arr[] = {1,3,7,7,8,9,9,9,10};
        System.out.println("#3. Array Compaction [1,3,7,7,8,9,9,9,10] : "+Arrays.toString(s.compactArray(arr)));
        
        int[] nn = {3,5,6};
        System.out.println("#4. LCM of 3, 5 and 6 is "+s.getLCM(nn));
        
        int[] r = {1,2,3,4,5,6};
        System.out.println("#5. Rotate Array [1,2,3,4,5,6] in 2 steps : "+ Arrays.toString(s.rotateArray(r, 2)));
        
    }
    
    
    
    String find_chars(String string1, String string2){
        String out = "";
        for(int i = 0; i < string1.length(); i++){
            for(int j = 0; j < string2.length(); j++){
                if(string1.charAt(i) == string2.charAt(j)){
                    out += string1.charAt(i);
                }
            }
        }
        return out;
    }
    
    int[] compactArray(int[] arr){
        int[] out = new int[arr.length];
        int c = 0; boolean flag;
        
        for(int i = 0; i < arr.length; i++){
            flag = false;
            for(int j = 0; j < out.length; j++){
                if(arr[i] == out[j]){
                    flag = true;
                }
            }
            if(!flag){
                out[c] = arr[i];
                c++;
            }
        }
        return Arrays.copyOf(out, c);
    }
    
    int getLCM(int[] nums){
        int biggest = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(biggest < nums[i]){
                biggest = nums[i];
            }
        }
        
        int lcm = biggest, c = 1;
        while(true){
            int i = 0;
            lcm = biggest * c;
            for(i = 0; i < nums.length; i++){
                if(!(lcm % nums[i] == 0))
                    break;
            }
            
            if(i == nums.length){
                return lcm;
            }
            c++;
        }
    }
    
    int[] rotateArray(int[] arr, int n){
        for(int i = 0; i < n; i++){
            arr = this.rotate(arr);
        }
        return arr;
    }
    
    int[] rotate(int[] arr){
        int[] out = new int[arr.length];
        for(int i = 0; i < arr.length-1; i++){
            out[i+1] = arr[i];
        }
        out[0] = arr[arr.length-1];
        return out;
    }
    
}
