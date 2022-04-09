package dmacc.beans;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class Condition {
	
	private double condition;
	private String dateGraded;

	public Condition() {
		super();
		this.dateGraded = "2020-01-01";
	}

	public Condition(double condition, String dateGraded) {
		super();
		this.condition = condition;
		this.dateGraded = dateGraded;
	}

	public double getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public String getDateGraded() {
		return dateGraded;
	}

	public void setDateGraded(String dateGraded) {
		this.dateGraded = dateGraded;
	}

	@Override
	public String toString() {
		return "Condition [condition=" + condition + ", dateGraded=" + dateGraded + "]";
	}
		

}
