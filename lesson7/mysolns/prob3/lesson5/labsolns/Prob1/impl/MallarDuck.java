package lesson5.labsolns.Prob1.impl;

import lesson5.labsolns.Prob1.behavior.FlyWithWings;
import lesson5.labsolns.Prob1.behavior.Quack;

public class MallarDuck extends Duck{

	@Override
	public void display() {
		System.out.println("  display");
	}
	
	public MallarDuck(){
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
}
