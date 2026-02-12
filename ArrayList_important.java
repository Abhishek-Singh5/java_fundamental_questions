//  Arraylist Basic

import java.util.ArrayList;
class Main{
    public static void main(String []k){
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(1);
        arr.add(2);
        arr.add(3);
        
        
        System.out.println(arr.size());
        
        arr.add(4);
        arr.add(5);
        arr.add(6);
        
        
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}



//  Arraylist infinite input



import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String []k){
        
        Scanner s1 = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(s1.hasNextInt()){
            int x = s1.nextInt();
            arr.add(x);
        }
        
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}




//  Arraylist in ArrayList {2D Matrix}




import java.util.ArrayList;
class Main{
    public static void main(String []k){
        
        ArrayList<Integer> a = new ArrayList<>();
        
        ArrayList<Integer> b = new ArrayList<>();
        
        ArrayList<Integer> c = new ArrayList<>();
        
        
        a.add(1);
        a.add(8);
        
        b.add(2);
        b.add(3);
        
        c.add(4);
        c.add(5);
        c.add(6);
        
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        arr.add(new ArrayList<Integer>(a));
        arr.add(new ArrayList<Integer>(b));
        arr.add(new ArrayList<Integer>(c));
        
        
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(i).size(); j++){
                
                System.out.print(arr.get(i).get(j) + " ");
            }
            
            System.out.println();
        }
    }
}
