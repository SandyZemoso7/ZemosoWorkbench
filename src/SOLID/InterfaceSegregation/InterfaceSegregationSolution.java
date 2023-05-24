package SOLID.InterfaceSegregation;

public class InterfaceSegregationSolution {
    public interface Workable {
        void work();
    }

    public interface Eatable {
        void eat();
    }

    public interface Sleepable {
        void sleep();
    }

    public class Engineer implements Workable {
        @Override
        public void work() {

        }
        // implementation
    }
}
