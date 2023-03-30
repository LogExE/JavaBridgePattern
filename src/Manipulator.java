import java.io.IOException;

public abstract class Manipulator {
    Database db;
    public Manipulator(Database db) {
        this.db = db;
    }
    public abstract void processData() throws IOException, ClassNotFoundException;
}
