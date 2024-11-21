package OOPS;


class Students{

     void info(){
        System.out.println("I do not have parameters.");
    }

     void info(int a){
        System.out.println("I have " + a + " as a parameter.");
    }

     void info(int a, int b){
        System.out.println("I have " + a + " " + b + " parameters.");
    }

     float info (int a , float b){
        return a*b;
    }

}
public class Overloading {
    public static void main(String[] args) {
        Students students = new Students();
        students.info();
        students.info(2);
        students.info(2,3);
        float res = students.info(3,4f);
        System.out.println(res);

    }
}
