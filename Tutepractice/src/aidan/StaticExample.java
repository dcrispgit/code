package aidan;

public class StaticExample {

    public static final int MAX_ITEMS = 25;
    public static final String ERROR_MESSAGE = "Oh dear it appears something went wrong my good chap.";

    private String name;
    private int age;

    public StaticExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
