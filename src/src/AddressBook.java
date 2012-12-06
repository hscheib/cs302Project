package src;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

/**
 * This is an Address Book class. It has the ability to add people, update
 * people, or return a list of all people.
 * 
 * @author Hunter
 * 
 */

public class AddressBook {

	/**
	 * Hashtable storing a Person as the value and the first name concat with the
	 * last name is the key
	 */
	private Hashtable<String, Person> people = new Hashtable<String, Person>();

	/**
	 * AddressBook Constructor
	 */
	public AddressBook() {

	}

	/**
	 * Returns the number of people in the address book
	 * 
	 * @return int
	 */
	public int size() {
		return people.size();
	}

	/**
	 * Add a person to the address book or throw exception if duplicate name.
	 * 
	 * @param person
	 * @throws Exception
	 */
	public void addPerson(Person person) throws Exception {
		if (!people.containsKey(person.getFirstName() + person.getLastName()))
			people.put(person.getFirstName() + person.getLastName(), person);
		else
			throw new Exception("Duplicate Name");
	}

	/**
	 * Return a list of all people in the address book
	 * 
	 * @return
	 */
	public List<Person> getAllPeople() {
		List<Person> peopleList = new LinkedList<Person>();

		Enumeration<Person> enumerationOfPeople = people.elements();

		while (enumerationOfPeople.hasMoreElements()) {
			peopleList.add(enumerationOfPeople.nextElement());
		}

		return peopleList;
	}

	/**
	 * Find and return a person in the address book
	 * 
	 * @param person
	 * @return
	 */
	public Person findPerson(Person person) {
		return people.get(person.getFirstName() + person.getLastName());
	}

	/**
	 * Update a person's information.
	 * 
	 * @param person
	 */
	public void updatePerson(Person person) {
		people.put(person.getFirstName() + person.getLastName(), person);
	}

}
