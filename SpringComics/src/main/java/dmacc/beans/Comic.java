package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

// @author AlSnyder - asnyder7

@Entity
@Table(name="my_spring_comics")
public class Comic {
	@Id
	@GeneratedValue
	private long id;
	private String publisher;
	private String title;
	private int volume;
	private int issue;
	@Autowired
	private Condition condition;
	@Autowired
	private CustomerInfo customerInfo;
	@Autowired
	private StorageInfo storage;
	
	
	//Constructors
	public Comic() {
		super();
		this.publisher = "Marvel";
	}

	public Comic(String title) {
		super();
		this.title = title;
	}

	public Comic(String title, int volume, int issue) {
		super();
		this.title = title;
		this.volume = volume;
		this.issue = issue;
	}
	
	
	public Comic(String publisher, String title, int volume, int issue) {
		super();
		this.publisher = publisher;
		this.title = title;
		this.volume = volume;
		this.issue = issue;
	}

	public Comic(long id, String publisher, String title, int volume, int issue) {
		super();
		this.id = id;
		this.publisher = publisher;
		this.title = title;
		this.volume = volume;
		this.issue = issue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getIssue() {
		return issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	}
	
	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public StorageInfo getStorage() {
		return storage;
	}

	public void setStorage(StorageInfo storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Comic [id=" + id + ", publisher=" + publisher + ", title=" + title + ", volume=" + volume + ", issue="
				+ issue + ", condition=" + condition + ", customerInfo=" + customerInfo + ", storage=" + storage + "]";
	}





	
	
	
}
