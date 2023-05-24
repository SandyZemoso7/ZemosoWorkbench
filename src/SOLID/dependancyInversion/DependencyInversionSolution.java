package SOLID.dependancyInversion;

public class DependencyInversionSolution {
    public interface Database {
        void saveUser(User user);
    }

    public class User {
        private Database database;

        public User(Database database) {
            this.database = database;
        }

        public void save() {
            // save user to the database
            database.saveUser(this);
        }
    }

    public class ConcreteDatabase implements Database {
        public void saveUser(User user) {
            // save user to the database
        }
    }
}
