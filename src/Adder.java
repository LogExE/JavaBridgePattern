import java.io.IOException;
import java.util.ArrayList;

public class Adder extends Manipulator {
    public Adder(Database db) {
        super(db);
    }

    @Override
    public void processData() throws IOException, ClassNotFoundException {
        ArrayList<Object> data = db.getObjects();
        System.out.println((int)data.get(0) + (int)data.get(1));
    }
}
