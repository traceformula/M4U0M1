package lesson5.labsolns.Prob1.impl;

import lesson5.labsolns.Prob1.behavior.CannotFly;
import lesson5.labsolns.Prob1.behavior.MuteQuack;

public class DecoyDuck extends Duck{

	@Override
	public void display() {
		System.out.println("  displaying");
	}
	
	public DecoyDuck(){
		setFlyBehavior(new CannotFly());
		setQuackBehavior(new MuteQuack());
	}
}
