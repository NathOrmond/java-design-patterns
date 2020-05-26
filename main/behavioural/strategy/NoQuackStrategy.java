package behavioural.strategy;

public class NoQuackStrategy implements IQuackBehaviour{

	public void quack() {
		System.out.print("I do not quack");
	}

}
