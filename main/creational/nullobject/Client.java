package creational.nullobject;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public IAnimal containsAnimal(IAnimal targetAnimal) { 
		List<IAnimal> animals = new ArrayList<IAnimal>();
		
		for(IAnimal animal : animals) { 
			if(animal.doSomething() == targetAnimal.doSomething()) { 
				return animal;
			}
		}
		
		return new NullAnimal();
	}
	
}
