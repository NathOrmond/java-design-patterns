package structural.adaptor.duckturkey;

public class ConcreteTurkey implements ITurkey {

	public void run() {
		System.out.println("I have no idea if turkeys can fly or not...");
	}

	public void gobble() {
		System.out.println("Gobble Gobble Gobble!");
	}

}
