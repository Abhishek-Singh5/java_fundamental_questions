class Student{
    
    private String name;
    private int age;
    private int marks[] = new int[3];
    
    
    
    Student(String Name, int Age, int Marks[]){
        
        name = Name;
        age = Age;
        marks[0] = Marks[0];
        marks[1] = Marks[1];
        marks[2] = Marks[2];
        
    }
    
    
    
    public String get_name() {
        return name;
        
    }
    
    public int get_age() {
        return age;
        
    }
    
    public int maximum_marks() {
        
        int max = -1;
        
        for(int i = 0; i < 3; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        
        
        return max;
        
    }
}


class Main{
    
    public static void main(String []q){
        
        int marks[] = new int[3];
        
        marks[0] = 89;
        marks[1] = 98;
        marks[2] = 82;
        
        
        Student s1 = new Student("Abhishek", 26, marks);
        
        System.out.println(s1.get_name());
        System.out.println(s1.get_age());
        System.out.println(s1.maximum_marks());
        
    }
}




