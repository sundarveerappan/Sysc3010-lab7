public class Address {
	private int unit;
	private String street;
	private String city;
	private String postalCode;
	private int firstType = 0;

	public Address(String street, String city, String postalCode)
			throws Exception {
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
		firstType = 1;
	}

	public Address(int unit, String street, String city, String postalCode)
			throws Exception {
		this.unit = unit;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}

	public String toString() {	
		if(firstType == 1){
			return (street+", "+city+", "+postalCode);
		}else{
			return (Integer.toString(unit)+", "+street+", "+city+", "+postalCode);
		}
	}

	public boolean equals(Object o) {
		if(o==null)
			return false;
		Address Address2 = (Address) o;
		
		if(firstType == 1){
			if(unit == Address2.unit && street == Address2.street && city == Address2.city && postalCode == Address2.postalCode)
				return true;
		}else{
			if(unit == Address2.unit && street == Address2.street && city == Address2.city && postalCode == Address2.postalCode)
				return true;
		}
		return false;
	}

	private boolean isValidPostalCode(String postalCode) {
		return false;
	}

}
