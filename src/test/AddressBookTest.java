package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.AddressBook;
import src.Person;

public class AddressBookTest {

	@Test
	public void createNewAddressBook() {
		AddressBook ab = new AddressBook();
		assertEquals(ab.size(), 0);
	}


}
