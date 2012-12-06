package test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import src.AddressBook;
import src.Person;

public class AddressBookTest {

	@Test
	public void createNewAddressBook() {
		AddressBook ab = new AddressBook();
		assertEquals(ab.size(), 0);
	}

	@Test
	public void addOnePersonToAddressBook() {
		AddressBook ab = new AddressBook();

		Person p = getTestPerson();

		try {
			ab.addPerson(p);
		} catch (Exception e) {
			fail("Should not throw exception");
		}
		assertEquals(ab.size(), 1);

	}

	@Test
	public void checkNewEntryInAddressBook() {
		AddressBook ab = new AddressBook();

		Person p = getTestPerson();

		assertEquals("Bob", p.getFirstName());
		assertEquals("Smith", p.getLastName());

		try {
			ab.addPerson(p);
		} catch (Exception e) {
			fail("Should not throw exception");
		}

		List<Person> people = ab.getAllPeople();

		assertEquals("Bob", people.get(0).getFirstName());
		assertEquals("Smith", people.get(0).getLastName());

	}

	@Test
	public void tryToAddDuplicateName() {
		AddressBook ab = new AddressBook();

		Person p1 = null;
		Person p2 = null;

		try {
			p1 = new Person("Bob", "Smith");
			p2 = new Person("Bob", "Smith");
		} catch (Exception e) {
			fail("Should not throw exception");
		}

		try {
			ab.addPerson(p1);
		} catch (Exception e) {
			fail("Should not throw exception");
		}

		try {
			ab.addPerson(p2);
			fail("Expected to fail");
		} catch (Exception e) {
			// PASSING SCENARIO
		}

		assertEquals(ab.size(), 1);

	}

	@Test
	public void lookUpPersonByName() {
		AddressBook ab = new AddressBook();

		Person p = getTestPerson();

		try {
			ab.addPerson(p);
		} catch (Exception e) {
			fail("Should not throw exception");
		}

		Person p2 = ab.findPerson(p);

		assertEquals("Bob", p2.getFirstName());
		assertEquals("Smith", p2.getLastName());

	}

	@Test
	public void updatePersonAddress() {
		AddressBook ab = new AddressBook();

		Person p = getTestPerson();

		assertEquals("123 Danger Dr", p.getAddress());

		try {
			ab.addPerson(p);
		} catch (Exception e) {
			fail("Should not throw exception");
		}

		Person p2 = ab.findPerson(p);
		p2.setAddress("321 Easy St");

		ab.updatePerson(p2);

		Person p3 = ab.findPerson(p);
		assertEquals("321 Easy St", p3.getAddress());

	}

	private Person getTestPerson() {
		Person p = null;
		try {
			p = new Person("Bob", "Smith", "123 Danger Dr", "Rolla", "MO", "65401", "1234567890");
		} catch (Exception e) {
			fail("Should not throw exception");
		}

		return p;
	}

}
