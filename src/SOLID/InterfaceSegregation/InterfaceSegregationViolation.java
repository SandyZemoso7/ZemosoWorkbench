package SOLID.InterfaceSegregation;

public class InterfaceSegregationViolation {
    public interface Worker {
        void work();
        void eat();
        void sleep();
    }

    public class Engineer implements Worker {
        @Override
        public void work() {

        }

        @Override
        public void eat() {

        }

        @Override
        public void sleep() {

        }
        // implementation
    }
}
