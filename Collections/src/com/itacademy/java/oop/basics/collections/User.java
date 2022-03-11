package com.itacademy.java.oop.basics.collections;

public class User {

    public static class Builder {
        private String firstname;
        private String lastname;
        private String city;
        private String country;
        private int age;
        private String userid;
        private CountryCode countryCode;
        private String email;

        public Builder(String firstname, String lastname, String city, String country, int age, CountryCode countryCode, String email) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.city = city;
            this.country = country;
            this.age = age;
            this.countryCode = countryCode;
            this.email = email;
        }

        public Builder withUserid(String userid) {
            this.userid = userid;
            return this;
        }

        public User build() {
            User user = new User();
            user.firstname = firstname;
            user.lastname = lastname;
            user.city = city;
            user.country = country;
            user.age = age;
            user.userid = userid;
            user.countryCode = countryCode;
            user.email = email;
            return user;
        }
    }

    private String firstname;
    private String lastname;
    private String city;
    private String country;
    private int age;
    private String userid;
    private CountryCode countryCode;
    private String email;

    public User() {
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", userid='" + userid + '\'' +
                ", countryCode=" + countryCode +
                ", email='" + email + '\'' +
                '}';
    }
}
