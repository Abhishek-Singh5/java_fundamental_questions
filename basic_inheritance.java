class Rectangle{
    
    int length;
    int breadth;
    
    Rectangle(int l, int b){
        
        length = l;
        breadth = b;
        
    }
    
    int perameter(){
        
        return 2 * (length * breadth);
    }
    
    int area(){
        
        return length * breadth;
    }
}

class Square extends Rectangle {
    
    
    Square(int l){
        
        super(l, l);
    }
}


class Main{
    public static void main(String []k){
        
        Square r1 = new Square(8);
        
        System.out.println(r1.perameter());
        System.out.println(r1.area());
    }
}




