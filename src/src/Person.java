package src;

public class Person {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;

	public Person(String first, String last) throws Exception {
		if(first == null || last ==null){
			throw new Exception();
		}
		this.firstName = first;
		this.lastName = last;
	}

	public Person(String first, String last, String addr, String city, String state, String zip, String phoneNo) throws Exception {
		if(first == null || last ==null){
			throw new Exception();
		}
		this.firstName = first;
		this.lastName = last;
		this.address = addr;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
