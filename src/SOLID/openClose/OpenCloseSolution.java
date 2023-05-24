package SOLID.openClose;

public class OpenCloseSolution {
    public interface Shape {
        double area();
    }

    public class Circle implements Shape {
        @Override
        public double area() {
            return 0;
        }
        // implementation
    }

    public class Square implements Shape {
        @Override
        public double area() {
            return 0;
        }
        // implementation
    }

    public class Triangle implements Shape {
        @Override
        public double area() {
            return 0;
        }
        // implementation
    }
}
