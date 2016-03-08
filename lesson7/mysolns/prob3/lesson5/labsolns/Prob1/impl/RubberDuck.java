package lesson5.labsolns.Prob1.impl;

import lesson5.labsolns.Prob1.behavior.CannotFly;
import lesson5.labsolns.Prob1.behavior.Squeak;

public class RubberDuck extends Duck{

	@Override
	public void display() {
		System.out.println("  displaying");
	}
	
	public RubberDuck(){
		setFlyBehavior(new CannotFly());
		setQuackBehavior(new Squeak());
	}
}
