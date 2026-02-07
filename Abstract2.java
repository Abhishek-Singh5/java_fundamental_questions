abstract class Car {
    
    public abstract void engine();
    
    public int tyre() {
        return 4;
    }
}

class BMW extends Car {
    
    public void engine(){
        System.out.println("12000 horse power");
    }
}

class Main{
    public static void main(String []k){
        
        BMW b1 = new BMW();
        
        b1.engine();
        
        System.out.println(b1.tyre());
    }
}
