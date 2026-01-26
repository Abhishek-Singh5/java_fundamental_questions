import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        String s = s1.next();
        
        
        int n = s.length();
        
        int i = 0;
        int j = n - 1;
        
        boolean flag = true;
        
        while(i < j){
            
            if(s.charAt(i) != s.charAt(j)){
                
                flag = false;
                break;
                
            }
            
            
            i++;
            j--;
        }
        
        
        if(flag == true){
            System.out.println("Palindrome");
            
        }else {
            System.out.println("Invalid");
        }

    }
}
