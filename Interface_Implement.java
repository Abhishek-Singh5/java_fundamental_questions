interface Drink {
    
    void getName();
    
    void drinkFeeling();
    
}

class Water implements Drink {
    
    public void getName(){
        
        System.out.println("Water");
        
    }
    
    public void drinkFeeling() {
        
        System.out.println("Water is Great");
    }
    
}


class Milk implements Drink {
    
    public void getName(){
        
        System.out.println("Milk");
        
    }
    
    public void drinkFeeling() {
        
        System.out.println("Milk is Healthy");
    }
    
}

class Main{
    public static void main(String []k){
        
        Drink d1 = new Water();
        Milk d2 = new Milk();
        
        d1.getName();
        d1.drinkFeeling();
        
        d2.getName();
        d2.drinkFeeling();
        
    }
}
