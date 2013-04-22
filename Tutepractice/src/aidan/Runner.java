package aidan;

public class Runner {

    public static void main(String[] args) {

        //This is typically what static variables are used for:
        System.out.println("The error message is: " + StaticExample.ERROR_MESSAGE);

        //Notice how you don't have to create an instance of the class??

        //This is how you use "non static" variables:

        StaticExample object1 = new StaticExample("Jeff", 25);
        StaticExample object2 = new StaticExample("Max", 14);

        System.out.println("Jeff's age: " + object1.getAge());
        System.out.println("Max's age: " + object2.getAge());


        //It's fine to mix static and non static variables in the same class
        // just remember that "non static" attributes can have a different value for each instance of the object.




    }
}
