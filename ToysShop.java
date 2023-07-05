import java.util.List;
import java.util.ArrayList;

public class ToysShop {
    List<Toy> shop;
    Toy toy;
    
    public ToysShop() {
        shop = new ArrayList();
    }
    
    public void addToy(Toy toy) {
        shop.add(toy);
    }
    
    
    public Toy getToyByName(String name) {
        for(Toy toy : shop) {
            if(toy.getName().equals(name)) {
                return toy;
            }
        }
        return toy;
    }
    
    public String showInfo() {
        StringBuilder sb = new StringBuilder();
        for(Toy toy : shop) {
            sb.append(toy);
            sb.append("\n");
        }
        return sb.toString();
    }
}