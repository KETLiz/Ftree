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
        System.out.println("Добрейшего времени суток!");
        while(work) {
            commands();
            String line = sc.nextLine();
            int numCommand = Integer.parseInt(line);
            switch(numCommand) {
                case 1: addToyByUser();
                        break;
                case 2: chooseToy();
                        break;
                case 3: System.out.println(raffleGame());
                        break;
                case 4: showToys();
                        break;
                case 5: System.out.println(showChooseToys());
                        break;
                case 6: exit();
                        break;
                default: System.out.println("Такой команды нет. Попробуем сначала?");
                        break;
            }
        }
    }
    
    public void commands() {
        System.out.println("Введите команду:\n1 - Добавить игрушку\n2 - Выбрать игрушку\n3 - Получить игрушку\n4 - Показать все игрушки\n5 - Показать выбранные игрушки\n6 - Выход");
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
    
    public Toy raffleGame() {
        return p.poll();
    }
    
    public void add(Toy toy) {
        p.add(toy);
    }
    
    public boolean exit() {
        return work = false;
    }
    
}
