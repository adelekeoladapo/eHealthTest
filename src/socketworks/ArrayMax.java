package socketworks;

public class ArrayMax {
    
    public static void main(String[] args){
        ArrayMax arrMax = new ArrayMax();
        int[] test = {7,4,2,16,0,7,8,4,5};
        System.out.println(arrMax.getMax(test));
    }
    
    int getMax(int[] arr){
        int max = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
