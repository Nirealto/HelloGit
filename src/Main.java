
public class Main {

    public static void main(String[] args) {
        Student studentMax = new Student();
        studentMax.name = "Max";
        studentMax.age = 20;
        studentMax.sayHello();
        Student studentDima = new Student();
        studentDima.name = "Dima";
        studentDima.sayHello();

        Class classJava = new Class();
        classJava.name = "Math";
        System.out.println(classJava.name);
    }
}
