package com.itacademy.java.oop.basics.collections;

import org.json.simple.JSONObject;

public class UserConverter {

    static User convertUser(JSONObject employeeObject) {
        User newUser = new User();
//      Creating User object
        newUser.setFirstname((String) employeeObject.get("firstname"));
        newUser.setLastname((String) employeeObject.get("lastname"));
        newUser.setCity((String) employeeObject.get("city"));
        newUser.setCountry((String) employeeObject.get("country"));
//        Checking age and userid existence
        if (employeeObject.get("age") != null) {
            newUser.setAge((int) Integer.parseInt(employeeObject.get("age").toString()));
        }
        if (employeeObject.get("userid") != null) {
            newUser.setUserid((int) Integer.parseInt(employeeObject.get("userid").toString()));
        }
        newUser.setCountryCode(CountryCode.valueOfCode(employeeObject.get("countryCode").toString()));
        newUser.setEmail((String) employeeObject.get("email"));

        return newUser;
    }
}
