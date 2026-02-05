class A{
    
    int age;
    
    void print(){
        
        age = 5;
        System.out.println("Class A");
    }
    
}

class B extends A{
    
    int age;
    
    void print(){
        
        
        age = 10;
        System.out.println("Class B");
    }
    
}

class Main{
    public static void main (String[] args) {
        
        B obj = new B();
        
        obj.print();
        
        System.out.println(obj.age);
    
    }
}
