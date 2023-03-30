import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Database db = new MemoryDatabase();
        new Adder(db).processData();
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.txt"));
        os.writeObject(2);
        os.writeObject(1);
        os.writeObject(2);
        os.close();
        db = new FileDatabase("test.txt");
        new Adder(db).processData();
    }
}