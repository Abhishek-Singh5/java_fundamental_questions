class Car{
    
    String type;
    int mirror;
    
    Car() {
        type = "Automatic";
        mirror = 4;
        System.out.println("Car Constructor Called");
    }
}

class BMW extends Car{
    
    String engine;
    
    BMW(){
        engine = "4000cc";
        System.out.println("BMW Constructor Called");
    }
    
}

class Main{
    public static void main(String []q){
        
        
        //Car c1 = new Car();
        BMW b1 = new BMW();
        
        System.out.println(b1.type);
        
        
        
    }
}
