package lesson5.labsolns.Prob1.impl;

import lesson5.labsolns.Prob1.behavior.FlyWithWings;
import lesson5.labsolns.Prob1.behavior.Quack;

public class RedheadDuck extends Duck{

	@Override
	public void display() {
		System.out.println("  displaying");
	}
	
	public RedheadDuck(){
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
}
