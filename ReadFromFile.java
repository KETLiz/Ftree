import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFile {
    Toy toysShop;

    public Toy load() throws ClassNotFoundException{
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("shop.txt"));
            toysShop = (Toy) objectInputStream.readObject();
            objectInputStream.close();
            return toysShop;
            } catch (SecurityException | IOException e) {
                e.printStackTrace();
                return null;
        }
    }
    
}