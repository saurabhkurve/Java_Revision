package OOPS;

class Animal{

    public void walk(){
        System.out.println("Animals Can Walk");
    }
}

class Men extends Animal{
    @Override
    public void walk() {
        super.walk(); // invokes base class method
        System.out.println("Men can walk");
    }

    public void talk(){
        System.out.println("Men can talk");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Men man = new Men();
        man.walk();
    }
}

