package SOLID.openClose;

public class OpenCloseViolation {
    public abstract class Shape {
        public abstract double area();
    }

    public class Circle extends Shape {
        @Override
        public double area() {
            return 0;
        }
        // implementation
    }

    public class Square extends Shape {
        @Override
        public double area() {
            return 0;
        }
        // implementation
    }
}
