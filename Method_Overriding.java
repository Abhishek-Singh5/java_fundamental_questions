class A{
    
    void print(){
        
        System.out.println("Class A");
    }
    
}

class B extends A{
    
    void print(){
        
        System.out.println("Class B");
    }
    
}

class Main{
    public static void main (String[] args) {
        
        B obj = new B();
        
        obj.print();
    }
}
