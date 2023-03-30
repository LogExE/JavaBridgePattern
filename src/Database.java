
import java.io.IOException;
import java.util.ArrayList;

public interface Database {
    ArrayList<Object> getObjects() throws IOException, ClassNotFoundException;
}
