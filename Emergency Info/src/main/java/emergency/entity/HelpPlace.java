package emergency.entity;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * Created by gii guide on 28/4/2557.
 */
@Entity
public class HelpPlace {
    @Id
    @GeneratedValue
    private Integer id;
   // private String id;
   @NotEmpty(message = "Please enter name")
   @Size(min=1,max=50,message = "Name must between 1 to 50 charecter")
    private String name;

    @Size(min=0,max=50,message = "Address name must between 0 to 50 charecter")
    private String address;

    @Size(min=0,max=50,message = "District name must between 0 to 50 charecter")
    private String district;

    @Size(min=0,max=5,message = "Name must between 0 to 5 charecter")
    private String zipcode;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE})
    //@NotEmpty(message = "Please enter province")
   // @Size(min=1,max=20,message = "Name must between 1 to 20 charecter")
    private Province province;

    @NotEmpty(message = "Please enter phone number")
    @Size(min=9,max=10,message = "Name must between 9 to 10 charecter")
    private String phoneNumber;

    //@NotEmpty(message = "Please enter latitude")
    //@Size(min=1,max=50,message = "Name must between 1 to 50 charecter")
    private double latitude;

    //@NotEmpty(message = "Please enter longitude")
    private double longitude;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE})
    //@NotEmpty(message = "Please enter category")
    private Category category;

    public HelpPlace() {
    }

    public HelpPlace(String name, String address, String district, String zipcode, Province province, String phoneNumber, double latitude, double longitude, Category category) {
        this.name = name;
        this.address = address;
        this.district = district;
        this.zipcode = zipcode;
        this.province = province;
        this.phoneNumber = phoneNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    //    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HelpPlace helpPlace = (HelpPlace) o;

        if (Double.compare(helpPlace.latitude, latitude) != 0) return false;
        if (Double.compare(helpPlace.longitude, longitude) != 0) return false;
        if (address != null ? !address.equals(helpPlace.address) : helpPlace.address != null) return false;
        if (category != null ? !category.equals(helpPlace.category) : helpPlace.category != null) return false;
        if (district != null ? !district.equals(helpPlace.district) : helpPlace.district != null) return false;
        if (id != null ? !id.equals(helpPlace.id) : helpPlace.id != null) return false;
        if (name != null ? !name.equals(helpPlace.name) : helpPlace.name != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(helpPlace.phoneNumber) : helpPlace.phoneNumber != null)
            return false;
        if (province != null ? !province.equals(helpPlace.province) : helpPlace.province != null) return false;
        if (zipcode != null ? !zipcode.equals(helpPlace.zipcode) : helpPlace.zipcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }
}
