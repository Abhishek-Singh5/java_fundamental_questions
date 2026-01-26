import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        int arr[][] = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = s1.nextInt();
            }
        }
        
        System.out.println();
        
        
        int row = 0;
        int col = 0;
        
        while(row < n && col < n){
            
            int temp = arr[row][col];
            arr[row][col] = arr[row][n - 1 - col];
            arr[row][n - 1 - col] = temp;
            
            
            row = row + 1;
            col = col + 1;
        }
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
}
