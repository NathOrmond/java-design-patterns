package creational.factory.abstractfactory;

public class ConcreteFactory extends AbstractFactory{

	@Override
	IComponent getComponentA() {
		return new AComponent();
	}

	@Override
	IComponent getComponentB() {
		return new BComponent();
	}

}
