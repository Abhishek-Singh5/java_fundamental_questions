class A {
    
    A() {
        System.out.println("Constructor 1");
    }
    
    A(int a) {
        System.out.println("Parameterized Constructor " + a);
    }
    
}

class B extends A{
    
    B() {
        super(8);
        System.out.println("Constructor 2");
    }
    
}

class C extends B{
    
    C() {
        System.out.println("Constructor 3");
    }
    
}

class Main{
    public static void main(String []k){
        
        C c1 = new C();
    }
}
