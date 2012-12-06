package src;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class AddressBook {

	private Hashtable<String, Person> people = new Hashtable<String, Person>();

	public AddressBook() {

	}

	public int size() {
		return people.size();
	}

	public void addPerson(Person person) throws Exception {
		if (!people.containsKey(person.getFirstName() + person.getLastName()))
			people.put(person.getFirstName() + person.getLastName(), person);
		else
			throw new Exception("Duplicate Name");

	}

	public List<Person> getAllPeople() {
		List<Person> peopleList = new LinkedList<Person>();

		Enumeration<Person> enumerationOfPeople = people.elements();

		while (enumerationOfPeople.hasMoreElements()) {
			peopleList.add(enumerationOfPeople.nextElement());
		}
		
		return peopleList;
	}

	public Person findPersonByName(Person person) {
		return people.get(person.getFirstName() + person.getLastName());
	}

	public void updatePerson(Person person) {
		people.put(person.getFirstName() + person.getLastName(), person);
	}

}
