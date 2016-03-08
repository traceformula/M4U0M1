package lesson5.labsolns.Prob1.impl;

import lesson5.labsolns.Prob1.behavior.*;
public abstract class Duck {
	public abstract void display();
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	protected void setFlyBehavior(FlyBehavior f){
		this.flyBehavior = f;
	}
	
	protected void setQuackBehavior(QuackBehavior q){
		this.quackBehavior = q;
	}
	
	public void fly(){
		if(flyBehavior != null){ 
			System.out.print("  ");
			flyBehavior.fly();
		}
	}
	
	public void quack(){
		if(quackBehavior != null){
			System.out.print("  ");
			quackBehavior.quack();
		}
	}
	public void swim(){
		System.out.println("  swimming");
	}
}
