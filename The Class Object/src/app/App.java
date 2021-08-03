package app;

class User {

}

class Employee extends User {

}

public class App {

    public static void main(String[] args) throws ClassNotFoundException {
        //1
        var class1 = Employee.class;

        System.out.println(class1);
        //2
        var class2 = Class.forName("app.Employee");

        System.out.println(class2);
        //3
        User u = new Employee();

        var class3 = u.getClass();

        System.out.println(class3);
    }
}
