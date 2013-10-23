public class Address
{
    private int unit;
    private String street;
    private String city;
    private String postalCode;

    public Address (String street, String city, String postalCode){
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }
    
    public Address (int unit, String street, String city, String postalCode)
    {
        this.unit = unit;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String toString()
    {
        return Integer.toString(unit) + " " + street + ", " + city + ", " + postalCode;
    }
    public boolean equals(Object o)
    {
        if(!(o instanceof Address))
        {
            return false;
        }
        Address other = (Address) o;
        if(other.getstreet().equals(street) && other.getunit() == unit && other.getcity().equals(city) && other.getpostalcode().equals(postalCode))
        {
            return true;
        }
        return false;
    }
    
    public String getstreet(){
        return street;
    }
    
    public int getunit(){
        return unit;
    }
    
    public String getcity(){
        return city;
    }
    
    public String getpostalcode(){
        return postalCode;
    }
    
    public boolean isValidPostalCode( String postalCode ) 
    {
        if(postalCode.isEmpty()){
            return false;
        }
        if(postalCode.length() != 6 ) {
            return false;
        }
        char[] post = postalCode.toCharArray();
        for (int i = 0; i < post.length; i = i + 2) {
            if( ! Character.isLetter(post[i]) ) {
                return false;
            }
        }
        for (int i = 1; i < post.length; i = i + 2) {
            if( ! Character.isDigit( post[i] ) ) {
                return false;
            }
        }
        return true;
    }
} 
