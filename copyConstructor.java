class Student{
    
    String name;
    int age;
    
    
    Student(){
        name = "Vishal";
        age = 25;
    }
    
    
    Student(String n, int a){
        
        name = n;
        age = a;
        
    }
    
    
    Student(Student copyConstructor){
        
        name = copyConstructor.name;
        age = copyConstructor.age;
        
    }
    
    
}

class Main{
    public static void main(String []k){
        
        Student s = new Student();
        
        System.out.println(s.name);
        System.out.println(s.age);
        
        Student s1 = new Student("Abhishek", 26);
        
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        
        Student s2 = new Student(s1);
        
        System.out.println(s2.name);
        System.out.println(s2.age);
        
    }
}
