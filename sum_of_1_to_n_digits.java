import java.util.Scanner;
class Main{
    public static void main(String []k){
        
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        for(int i = 1; i <= n; i++){
            
            int copy = i;
            int sum = 0;
            
            while(copy > 0){
                int last = copy % 10;
                sum = sum + last;
                copy = copy / 10;
            }
            
            System.out.println(i + " -> " + sum);
        }
        
        
    }
}
