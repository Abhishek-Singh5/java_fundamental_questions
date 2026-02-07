interface Drink{
    
    // in the interface we only initilizations method we can't implement.
    
    void verifyHealthyDrinks();
    
}

class Water implements Drink {
    
    public void verifyHealthyDrinks(){
        
        System.out.println("Healthy Drinks");
        
    }
}


class Pepsi implements Drink {
    
    public void verifyHealthyDrinks(){
        
        System.out.println("Bad Drinks");
        
    }
}

class Main{
    public static void main(String []q){
        
        Drink d1 = new Water();
        Drink d2 = new Pepsi();
        
        d2.verifyHealthyDrinks();
    }
}
