import java.io.IOException;
import java.util.ArrayList;

public class MemoryDatabase implements Database {
    private ArrayList<Object> storage;

    public MemoryDatabase() {
        storage = new ArrayList<>();
        storage.add(32);
        storage.add(35);
        storage.add(42);
    }
    @Override
    public ArrayList<Object> getObjects() {
        return storage;
    }
}
