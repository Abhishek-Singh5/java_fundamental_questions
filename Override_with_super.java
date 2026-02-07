class Instrument {
    
    void makeSound(){
        System.out.println("Instrument have the beautifull sound");
    }
    
}

class Erhu extends Instrument{
    
    void makeSound(){
        // super.makeSound();
        System.out.println("Erhu is good for here");
    }
    
}


class Piyano extends Instrument{
    
    void makeSound(){
        System.out.println("Piyano is feeling for ear");
    }
    
}


class Violin extends Instrument{
    
    void makeSound(){
        super.makeSound();
        System.out.println("Violin is heart for sound");
    }
    
}


class Main{
    public static void main (String[] args) {
        
        Erhu h1 = new Erhu();
        Piyano h2 = new Piyano();
        Violin h3 = new Violin();
        
        h1.makeSound();
        h2.makeSound();
        h3.makeSound();
    }
}


