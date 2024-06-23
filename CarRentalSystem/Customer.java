package model;
public class Customer {
    private String name;
    private String contactNumber;
    private String drivingLicenseNumber;

    public Customer(String name,String contactactNumber,String drivingLicenseNumber) {
        this.name=name;
        this.contactNumber=contactactNumber;
        this.drivingLicenseNumber=drivingLicenseNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public String getDrivingLicenseNumber() {
        return this.drivingLicenseNumber;
    }

}
