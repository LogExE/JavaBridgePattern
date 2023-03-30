import java.io.*;
import java.util.ArrayList;

public class FileDatabase implements Database {
    ObjectInputStream is;
    public FileDatabase(String name) throws IOException {
        is = new ObjectInputStream(new FileInputStream(name));
    }

    @Override
    public ArrayList<Object> getObjects() throws IOException, ClassNotFoundException {
        int count = (int)is.readObject();
        ArrayList<Object> ret = new ArrayList<>();
        for (int i = 0; i < count; ++i)
            ret.add(is.readObject());
        return ret;
    }
}
