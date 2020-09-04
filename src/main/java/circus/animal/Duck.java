<<<<<<< HEAD:src/main/java/Duck.java
public class  Duck extends Bird {
=======
package circus.animal;

public class Duck extends Bird {
>>>>>>> inlecture:src/main/java/circus/animal/Duck.java
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public int getValue() {
        return 10;
    }
}
