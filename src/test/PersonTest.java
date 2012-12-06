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


}
