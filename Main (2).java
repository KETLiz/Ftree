public class Main
{
	public static void main(String[] args) {
	    
		Console c = new Console();
		c.addToy(new Toy(1, "li", 35));
		c.addToy(new Toy(2, "Vi", 80));
		c.addToyByUser();
		
		c.showToys();
		c.chooseToy();
		System.out.println(c.showChooseToys());
	}
}
