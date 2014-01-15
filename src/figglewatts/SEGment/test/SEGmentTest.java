package figglewatts.SEGment.test;

import figglewatts.SEGment.ComponentEngine;

public class SEGmentTest {

	public static void main(String[] args) throws Exception {
		System.out.println("Running...");
		TestObject object = new TestObject();
		RandomComponent randomComponent = new RandomComponent();
		randomComponent.setMultiplier(5);
		RandomerComponent randomerComponent = new RandomerComponent();
		randomerComponent.setNumber(8);
		object.components.add(randomComponent);
		object.components.add(randomerComponent);
		MultiplierNode node = new MultiplierNode();
		MultiplierSystem system = new MultiplierSystem();
		ComponentEngine.registerNode(node);
		ComponentEngine.addSystem(system);
		ComponentEngine.registerObject(object);
		System.out.println(((RandomerComponent) object.components.get("RandomerComponent")).getNumber());
	}
}
