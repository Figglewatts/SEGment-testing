package figglewatts.SEGment.test;

import java.util.ArrayList;
import java.util.List;

import figglewatts.SEGment.BaseObject;
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
	}

	@Override
	public void update(double arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
