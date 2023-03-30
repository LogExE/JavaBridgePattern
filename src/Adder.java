import java.io.IOException;
import java.util.ArrayList;

public class Adder extends Manipulator {
    public Adder(Database db) {
        super(db);
    }

    @Override
    public void processData() throws IOException, ClassNotFoundException {
        ArrayList<Object> data = db.getObjects();
        int a = (int)data.get(0);
        int b = (int)data.get(1);
        System.out.printf("%d + %d = %d%n", a, b, a + b);
    }
}
