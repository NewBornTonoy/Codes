class Student{
    String name;
    int age;
    public void info(String name){
        System.out.println(name);
    }
    public void info(int age){
        System.out.println(age);
    }
    
}

public class Polymorphism{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "tanvir";
        s1.age = 20;
        s1.info(s1.name);
        s1.info(s1.age);


    }
}