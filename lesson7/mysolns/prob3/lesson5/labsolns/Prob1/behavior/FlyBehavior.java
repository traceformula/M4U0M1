package lesson5.labsolns.Prob1.behavior;

public interface FlyBehavior {
	default public void fly(){
		System.out.println("fly with wings");
	}
}
