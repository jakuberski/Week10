package store.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String phone;
	private int zipCode;
	@Autowired
	private Address address;

	public Store() {
		super();
		this.zipCode = 50021;
	}

	public Store(String name) {
		super();
		this.name = name;
	}

	public Store(String name, String phone, int zipCode) {
		super();
		this.name = name;
		this.phone = phone;
		this.zipCode = zipCode;
	}

	public Store(long id, String name, String phone, int zipCode) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.zipCode = zipCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", phone=" + phone + ", zipCode=" + zipCode + "]";
	}
	
	

}
