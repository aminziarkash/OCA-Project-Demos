
public class Employee {

    private StringBuilder name = new StringBuilder("Amin Ziarkash"); // Different ID

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    void printName() {
        System.out.println("encapsulated, mutable StringBuilder content\t:\t" + name);
    }
}
