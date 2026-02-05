class Car{
    
    String type;
    int mirror;
    
    Car() {
        type = "Automatic";
        mirror = 4;
        System.out.println("Car Constructor Called");
    }
    
    Car(int m) {
        
        System.out.println("Car Parameterized Constructor Called");
        mirror = m;
        
    }
}

// super keyword --> called parent class Constructor

class BMW extends Car{
    
    String engine;
    
    BMW(){
        super(45);
        engine = "4000cc";
        System.out.println("BMW Constructor Called");
    }
    
}

class Main{
    public static void main(String []q){
        
        BMW b1 = new BMW();
        
        System.out.println(b1.mirror);
        
        
    }
}
