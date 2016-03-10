// CollectIntoMapTest.java
package lesson9.lecture.streamandoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectIntoMapTest {
	public static void main(String[] args) {
		Map<Person.Gender, Person> highestEarnerByGender = Person.persons().stream()
				.collect(Collectors.toMap(Person::getGender, 
				Function.identity(),
				(oldPerson, newPerson) -> newPerson.getIncome() > oldPerson.getIncome() ? newPerson : oldPerson));

		System.out.println(highestEarnerByGender);

		// group people by gender and count the number of people in each group
		Map<Person.Gender, Long> countByGender = Person.persons().stream()
				.collect(Collectors.groupingBy(Person::getGender, Collectors.counting()));
		System.out.println(countByGender);

		Map<Long, Person> idToPerson = Person.persons().stream()
				.collect(Collectors.toMap(Person::getId, Function.identity()));
		System.out.println(idToPerson);
	}
}
