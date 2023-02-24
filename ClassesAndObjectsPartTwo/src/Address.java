public class Address {
    private String country;
    private String province;
    private String city;
    private String streetName;
    private String postalCode;
    private int houseNumber;

    public void setCountry(String country){this.country = country;}
    public void setProvince(String province){this.province = province;}
    public void setCity(String city){this.city = city;}
    public void setStreetName(String streetName){this.streetName = streetName;}
    public void setHouseNumber(int houseNumber){this.houseNumber = houseNumber;}

    public String getStreet(){
        return houseNumber + " " + streetName;
    }
    public String getCity(){return city;}
    public String getCountry(){return country;}
    public String getProvince(){return province;}
    public String getPostalCode(){return postalCode;}

    public String toString(){
        String info;
        info = String.format("%20s %s\n%20s %s\n%20s %d","Street", getStreet(), "City", getCity(),
                "Province", getProvince(), "Country", getCountry(), "Postal Code", getPostalCode());
        return info;
    }

}
