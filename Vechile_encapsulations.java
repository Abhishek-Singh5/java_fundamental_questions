class Vechile{
    
    int speed;
    int acceleration;
    int time;
    int volume;
    
    
    Vechile(int s, int a, int t, int v){
        
        speed = s;
        acceleration = a;
        time = t;
        volume = v;
        
    }
    
    void move() {
        
        System.out.println("Speed = " + speed);
        System.out.println("Acceleration = " + acceleration);
        System.out.println("Time = " + time);
        
    }
    
    
    void setSpeed(int initialSpeed){
        
        speed = initialSpeed;
        
    }
    
    
    void speedUp() {
        
        speed = speed + acceleration * time;
        
    }
    
    
    void speedDown() {
        
        
        speed = speed - acceleration * time;
        
        if(speed < 0){
            speed = 0;
        }
    }
}

class Main{
    public static void main(String []k){
        
        Vechile v1 = new Vechile(40, 25, 5, 60);
        
        v1.setSpeed(10);
        v1.move();
        v1.speedUp();
        v1.move();
        v1.speedDown();
        v1.move();
    }
}
