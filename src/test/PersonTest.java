package test;
import static org.junit.Assert.*;
import src.Person;

import org.junit.Test;

public class PersonTest {

	@Test
	public void createPersonWithInvalidFirstName() {
		try {
			Person p = new Person(null, "Smith");
			fail("Expected to fail");
		} catch (Exception e) {
			// PASSING SCENARIO
		}

	}

	@Test
	public void createPersonWithInvalidLastName() {
		try {
			Person p = new Person("Bob", null);
			fail("Expected to fail");
		} catch (Exception e) {
			// PASS SCENARIO

		}
	}

	@Test
	public void createPersonWithMinimumRequirements() {
		Person p = null;
		try {
			p = new Person("Bob", "Smith");
		} catch (Exception e) {
			fail("Should not throw exception");
		}
		assertEquals(p.getFirstName(), "Bob");
		assertEquals(p.getLastName(), "Smith");
	}

	@Test
	public void createPersonWithFullRequirements() {
		Person p = null;
		try {
			p = new Person("Bob", "Smith", "123 Danger Dr", "Rolla", "MO", "65401", "1234567890");
		} catch (Exception e) {
			fail("Should not throw exception");
		}

		assertEquals(p.getFirstName(), "Bob");
		assertEquals(p.getLastName(), "Smith");
		assertEquals(p.getAddress(), "123 Danger Dr");
		assertEquals(p.getCity(), "Rolla");
		assertEquals(p.getState(), "MO");
		assertEquals(p.getZip(), "65401");
		assertEquals(p.getPhoneNumber(), "1234567890");
	}

	@Test
	public void changePersonAddress() {
		Person p = getTestPerson();

		assertEquals(p.getAddress(), "123 Danger Dr");

		p.setAddress("321 Easy St");

		assertEquals(p.getAddress(), "321 Easy St");

	}
	
	@Test
	public void changePersonCity() {
		Person p = getTestPerson();

		assertEquals(p.getCity(), "Rolla");

		p.setCity("Chicago");

		assertEquals(p.getCity(), "Chicago");

	}
	
	@Test
	public void changePersonState() {
		Person p = getTestPerson();

		assertEquals(p.getState(), "MO");

		p.setState("IL");

		assertEquals(p.getState(), "IL");

	}
	
	@Test
	public void changePersonZip() {
		Person p = getTestPerson();

		assertEquals(p.getZip(), "65401");

		p.setZip("33333");

		assertEquals(p.getZip(), "33333");

	}
	
	@Test
	public void changePersonPhoneNumber() {
		Person p = getTestPerson();

		assertEquals(p.getPhoneNumber(), "1234567890");

		p.setPhoneNumber("5556664444");

		assertEquals(p.getPhoneNumber(), "5556664444");

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
