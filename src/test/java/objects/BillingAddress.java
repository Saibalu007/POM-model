package objects;

public class BillingAddress {
	private String companyName;
	private String firstName;
	private String lastName;
	private String vatNo;
	private String streetName;

	private String cityName;
	private String postalCode;
	private String phoneNum;

	private String mailId;

	public String getMailId() {
		return mailId;
	}

	public BillingAddress setMailId(String mailId) {
		this.mailId = mailId;
		return this;
	}

	public String getCompanyName() {
		return companyName;
	}

	public BillingAddress setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public BillingAddress setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public BillingAddress setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getVatNo() {
		return vatNo;
	}

	public BillingAddress setVatNo(String vatNo) {
		this.vatNo = vatNo;
		return this;
	}

	public String getStreetName() {
		return streetName;
	}

	public BillingAddress setStreetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	public String getCityName() {
		return cityName;
	}

	public BillingAddress setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public BillingAddress setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public BillingAddress setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
		return this;
	}

}
