package socketworks;

import java.util.Arrays;

public class MissingNumber {
    
    public static void main(String[] args){
        MissingNumber m = new MissingNumber();
        int[] test = {4,7,2,10,99,6,3,1,5,8};
        
        System.out.println("Missing Number : "+m.getMissingNum(test));
    }
    
    
    int getMissingNum(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != (i+1)){
                return (i+1);
            }
        }
        return 0;
    }
    
}
