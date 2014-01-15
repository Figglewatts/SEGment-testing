package figglewatts.SEGment.test;

import java.util.ArrayList;
import java.util.List;

import figglewatts.SEGment.ComponentEngine;
import figglewatts.SEGment.ISystem;
import figglewatts.SEGment.Node;

public class MultiplierSystem implements ISystem {

	public List<MultiplierNode> targets = new ArrayList<MultiplierNode>();

	@Override
	public void start() {
		// TODO Auto-generated method stub
		for (Node node : ComponentEngine.getNodes("MultiplierNode")) {
			targets.add((MultiplierNode)node);
		}
		for (Node node : targets) {
			RandomComponent random = (RandomComponent)node.components.get("RandomComponent");
			RandomerComponent randomer = (RandomerComponent)node.components.get("RandomerComponent");
			randomer.setNumber(randomer.getNumber() * random.getMultiplier());
		}
	}

	@Override
	public void update(double delta) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
