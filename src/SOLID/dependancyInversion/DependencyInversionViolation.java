package SOLID.dependancyInversion;

public class DependencyInversionViolation {
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

    public class Database {
        public void saveUser(User user) {
            // save user to the database
        }
    }
}
