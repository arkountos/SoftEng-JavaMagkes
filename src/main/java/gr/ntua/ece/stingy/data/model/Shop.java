package gr.ntua.ece.stingy.data.model;

import java.util.Objects;

public class Shop {

    private final long id;
    private final String name;
    private final String address;
    private final double lng;
    private final double lat;
    private final String tags;
    private final boolean withdrawn;
    
	public Shop(long id, String name, String address, double lng, double lat, String tags, boolean withdrawn) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.lng = lng;
		this.lat = lat;
		this.tags = tags;
		this.withdrawn = withdrawn;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the longitude
	 */
	public double getLng() {
		return lng;
	}

	/**
	 * @return the latitude
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * @return the withdrawn
	 */
	public boolean isWithdrawn() {
		return withdrawn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(address, id, lat, lng, name, tags, withdrawn);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Shop other = (Shop) obj;
		return Objects.equals(address, other.address) && id == other.id
				&& Double.doubleToLongBits(lat) == Double.doubleToLongBits(other.lat)
				&& Double.doubleToLongBits(lng) == Double.doubleToLongBits(other.lng)
				&& Objects.equals(name, other.name) && Objects.equals(tags, other.tags) && withdrawn == other.withdrawn;
	}

	
	
    
}