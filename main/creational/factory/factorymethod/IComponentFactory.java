package creational.factory.factorymethod;

public class IComponentFactory {
	
	public IComponent createComponent() { 
		return new AComponent();
	}
}
