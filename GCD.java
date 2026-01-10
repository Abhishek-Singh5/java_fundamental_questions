import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int a = s1.nextInt();
        int b = s1.nextInt();
        
        int min = Math.min(a, b);
        int answer = 1;
        
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                answer = Math.max(answer, i);
            }
        }
        
        System.out.println(answer);
    }
}
