package lesson5.labsolns.Prob1.behavior;

public interface QuackBehavior {
	default public void quack(){
		System.out.println("quacking");
	}
}
