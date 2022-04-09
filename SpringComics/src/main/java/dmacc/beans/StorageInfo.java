package dmacc.beans;

import java.util.Date;

import javax.persistence.Embeddable;


@Embeddable
public class StorageInfo {
	private String locationId;
	private Boolean slabbed;
	private String lastBoarded;
	
	public StorageInfo() {
		super();
		this.slabbed = false;
		this.lastBoarded = "01-01-2020";		
	}

	public StorageInfo(String locationId, Boolean slabbed, String lastBoarded) {
		super();
		this.locationId = locationId;
		this.slabbed = slabbed;
		this.lastBoarded = lastBoarded;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public Boolean getSlabbed() {
		return slabbed;
	}

	public void setSlabbed(Boolean slabbed) {
		this.slabbed = slabbed;
	}

	public String getLastBoarded() {
		return lastBoarded;
	}

	public void setLastBoarded(String lastBoarded) {
		this.lastBoarded = lastBoarded;
	}

	@Override
	public String toString() {
		return "StorageInfo [locationId=" + locationId + ", slabbed=" + slabbed + ", lastBoarded=" + lastBoarded + "]";
	}
	
	
	
	

}
