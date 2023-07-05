public class Toy implements Comparable<Toy>{
    private int id;
    private String name;
    private int weight;
    
    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String toString() {
        return "id: " + id + ", name: " + name + ", weight: " + weight;
    }
    
    public int compareTo(Toy o) {
        return Integer.valueOf(this.getWeight()).compareTo(Integer.valueOf(o.getWeight()));
    }
}