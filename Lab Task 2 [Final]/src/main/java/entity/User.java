package entity;

import util.CountryUtil;

import javax.validation.constraints.*;

public class User {

    @NotNull(message = "First Name Can Not be empty")
    @Size(min = 2, max = 10)
    private String firstname;

    @NotNull(message = "Last Name Can Not be empty")
    private String lastname;

    @NotNull
    private Gender gender;

    @NotNull
    private String country;

    private String[] operatingSystems;

    public User() {
    }

    public User(String firstname, String lastname, Gender gender, String country, String[] operatingSystems) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.country = country;
        this.operatingSystems = operatingSystems;
    }

//    public User(String firstname, String lastname, Gender gender, String country) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.gender = gender;
//        this.country = new CountryUtil().getCountry(country);
//    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //public String[] getOperatingSystems() { return operatingSystems; }

    public void setOperatingSystems(String[] operatingSystems) { this.operatingSystems = operatingSystems; }

    public String getOperatingSystems(){
        String s = "";
        for (String os: operatingSystems) {
            s += os + " ";
        }
        return s;
    }
}
