//******************************************
// Address. java
//  Represents a street address
//******************************************

package school;

public class Address {
    private String streetAddress, city, state;
    private long zipCode;

    public Address(String street, String town, String st, long zip) {
        this.streetAddress = street;
        this.city = town;
        this.state = st;
        this.zipCode = zip;
    }

    public String toString() {
        String result;
        result = streetAddress + "\n";
        result += city + ", " + state + " " + zipCode;
        return result;
    }
}
