class SchoolMember{
    
    String name;
    static int number;  // Number of ojects
    
    SchoolMember() {
        
    }
    
}

class Teacher extends SchoolMember{
    
    Teacher(){
        
        number++;
        
    }
}

class Student extends SchoolMember{
    
    Student() {
        number++;
        
    }
}

class Main{
    public static void main(String []k){
        
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        Teacher t4 = new Teacher();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        
        System.out.println(SchoolMember.number);
    }
}
