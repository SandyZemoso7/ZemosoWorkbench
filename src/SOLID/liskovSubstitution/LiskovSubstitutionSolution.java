package SOLID.liskovSubstitution;

public class LiskovSubstitutionSolution {
    public interface Flyable {
        void fly();
    }

    public class Bird implements Flyable {
        public void fly() {
            // implementation
        }
    }

    public class Penguin extends Bird {
        // implementation without fly() method
    }
}
