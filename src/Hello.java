
public class Hello {
    
    public static void main(String[] args){
        Hello hello = new Hello();
        System.out.println(hello.getSimmi("deleke", "delapo"));
    }
    
    void greet(String name){
        System.out.println("Hello "+name);
    }
    
    int getSimmi(String str1, String str2){
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
    
}
