import java.util.Scanner;
import java.util.PriorityQueue;

public class Console {
    private boolean work;
    private Scanner sc;
    private ToysShop shop;
    private PriorityQueue<Toy> p;
    
    public Console() {
        work = true;
        sc = new Scanner(System.in);
        shop = new ToysShop();
        p = new PriorityQueue();
    }
    
    public void start() {
        System.out.println("Hello!");
        while(work) {
            System.out.println("Введите команду:\n1 - Добавить игрушку\n2 - Выбрать игрушку\n4 - Получить игрушку\n5 - Выход");
        }
    }
    
    public void addToyByUser() {
        System.out.println("Введите id игрушки: ");
        String line = sc.nextLine();
        int id = Integer.parseInt(line);
        System.out.println("Введите имя игрушки: ");
        String name = sc.nextLine();
        System.out.println("Введите вес игрушки: ");
        String line2 = sc.nextLine();
        int weight = Integer.parseInt(line2);
        shop.addToy(new Toy(id, name, weight));
    }
    
    public void addToy(Toy toy) {
        shop.addToy(toy);
    }
    
    public void chooseToy() {
        System.out.println("Введите название игрушки, которая вам нравится: ");
        String name = sc.nextLine();
        Toy toy = shop.getToyByName(name);
        p.add(toy);
    }
    
    public String showChooseToys() {
        StringBuilder sb = new StringBuilder();
        for(Toy toy : p) {
            sb.append(toy);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public void showToys() {
         System.out.println(shop.showInfo());
    }
}