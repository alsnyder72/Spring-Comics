package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerInfo {
	private String name;
	private String street;
	private String city;
	private String state;
	
	public CustomerInfo() {
		super();
	}

	public CustomerInfo(String name, String street, String city, String state) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	@Override
	public String toString() {
		return "CustomerInfo [name=" + name + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
