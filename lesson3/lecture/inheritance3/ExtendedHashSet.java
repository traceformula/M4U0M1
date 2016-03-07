package lesson3.lecture.inheritance3;

import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("serial")
public class ExtendedHashSet<T> extends HashSet<T> {
	//The number of attempted element insertions since its creation --
	//this value will not be modified when elements are removed
	private int addCount = 0;
	
	public ExtendedHashSet() {}
	
	@Override
	public boolean add(T a) {
		addCount++;
		return super.add(a);
	}
	@Override
	public boolean addAll(Collection<? extends T> c) {
		addCount += c.size();
		//System.out.println((addCount));
		return super.addAll(c); // addAll method invoke add() method to insert all the elements from the collection
	}
	public int getAddCount() {
		return addCount;
	}
}
