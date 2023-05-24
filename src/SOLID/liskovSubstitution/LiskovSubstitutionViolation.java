package SOLID.liskovSubstitution;

public class LiskovSubstitutionViolation {
    public class Bird {
        public void fly() {
            // implementation
        }
    }

    public class Penguin extends Bird {
        // cannot fly
    }
}
