package OOPS;

import java.util.concurrent.ConcurrentMap;

class Employee{
    private String name;
    private String address;
    private String company;
    private String age;
    Employee(){
        System.out.println("Default constructor");
    }

    Employee(String name){
        this.name = name;
    }

    Employee(String name, String address){
        this(name);
        this.address = address;
    }

    Employee (String name, String  address, String company){
        this(name,address);
        this.company = company;
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(company);
    }
}

class Company extends Employee{
    Company(String name, String address, String company){
        super(name, address, company);
        System.out.println("This is company constructor");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Company company = new Company("John", "LA, USA", "Meta");
        company.getInfo();
    }
}
