package structural.adaptor.duckturkey;

public class Client {
	
	private IDuck iOnlyKnowDucksFOrSomeReason;
	
	public Client() {
		doClientStuff();
	}
	
	void doClientStuff() { 
		iOnlyKnowDucksFOrSomeReason = new DuckTurkeyAdapter(new ConcreteTurkey());
		iOnlyKnowDucksFOrSomeReason.fly();
		iOnlyKnowDucksFOrSomeReason.quack();
	}

}
