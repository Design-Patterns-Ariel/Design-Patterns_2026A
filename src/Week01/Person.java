package Week01;

public class Person {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0)
            throw new IllegalArgumentException();
        this.name = name;
    }
}
