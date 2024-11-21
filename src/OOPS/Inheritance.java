package OOPS;

class Person{
    private String name;
    private String address;
    private int age;

    Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void getInfo(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
    }

    void tempMethodParent(){
        System.out.println("Parent class method");
    }

}
class Student extends Person{

    Student(String name, String address, int age){
        super(name, address, age);
    }

    void tempMethodChild(){
        System.out.println("Child class method");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("Saurabh", "Nagpur",24);
        student.getInfo();
        student.tempMethodParent();
        student.tempMethodChild();
    }
}
