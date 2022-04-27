package dmacc.beans;

//@author AlSnyder - asnyder7

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private long custId;
	private String firstName;
	private String lastName;
	private String phone;
	@Autowired
	private Address address;
	
	//Constructors
	public Customer() {
		super();
	}

	/*
	public Customer(long id, String firstName, String lastName, String phone, Address address) {
		super();
		this.custId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	//Getters and Setters

	public long getId() {
		return custId;
	}

	public void setId(long id) {
		this.custId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	*/

	
	
}
