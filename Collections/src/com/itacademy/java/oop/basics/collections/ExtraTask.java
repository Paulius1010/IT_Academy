package com.itacademy.java.oop.basics.collections;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ExtraTask {
    //TODO: First complete step 1, then step 2 and etc...
    //TODO: Make application working. There could be problems with gradle, refresh dependencies.
    //TODO: Create User class with parameters from user.json file.
    //TODO: Set User firstname, lastName... Use Enum for country code.

    public static void main(String[] args) {
        List<User> newUsersList = new ArrayList<User>();

        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("src/resources/users.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray usersList = (JSONArray) obj;

            //TODO: Create User list and add all Users.
            usersList.forEach(user -> newUsersList.add(parseEmployeeObject((JSONObject) user)));
//              did not work
//            List<User> newUsersList = usersList.stream().map(user -> convertFromJsonToUser((JSONObject) user)).collect(Collectors.toList());
//    private static User convertFromJsonToUser(JSONObject user) {
//        JSONObject employeeObject = (JSONObject) user.get("user");
//        String firstName = (String) employeeObject.get("firstname");
//        String lastName = (String) employeeObject.get("lastName");
//        String city = (String) employeeObject.get("city");
//        String country = (String) employeeObject.get("country");
//        int age = (int) Integer.parseInt(employeeObject.get("age").toString());
//        CountryCode countryCode = CountryCode.valueOfCode(employeeObject.get("countryCode").toString());
//        String email = (String) employeeObject.get("email");
//        User newUser = new User(firstName, lastName, city, country, age, countryCode, email);
//        System.out.println(newUser);
//        return newUser;
//    }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //TODO: Order list from youngest user to oldest (Use Custom Comparator).
        List<User> sortedByAge = newUsersList.stream().sorted(new UserAgeComparator()).collect(Collectors.toList());
//        Collections.sort(newUsersList, new UserAgeComparator());
//        newUsersList.sort(Comparator.comparing(user -> user.getAge()));
//        newUsersList.sort(Comparator.comparing(User::getAge));

        //TODO: Filter list by userId > 10000.  (Use Stream)
        System.out.println(newUsersList.size());
        List<User> filteredByUserid = newUsersList.stream().filter(user -> Objects.nonNull(user.getUserid())).filter(user -> Integer.parseInt(user.getUserid()) > 10000).collect(Collectors.toList());
        System.out.println(filteredByUserid.size());

//                newUsersList.stream().map(user -> user.getUserid()).filter(userid -> Objects.nonNull(userid)).filter()
//        .collect(Collectors.toList());
//        If ID is not existent, remove those users.
//        ???
//        System.out.println(filteredByUserid.size());

        //TODO: Find the Oldest and the Youngest user.
        Optional<User> youngest = newUsersList.stream().min(Comparator.comparing(User::getAge));
        User oldest = newUsersList.stream().min(Comparator.comparing(User::getAge)).orElseThrow(NoSuchElementException::new);
    }

    private static User parseEmployeeObject(JSONObject user) {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) user.get("user");
        //Get user first name
        String firstName = (String) employeeObject.get("firstname");
        String lastName = (String) employeeObject.get("lastName");
        String city = (String) employeeObject.get("city");
        String country = (String) employeeObject.get("country");
        int age = (int) Integer.parseInt(employeeObject.get("age").toString());
        String userid = (String) employeeObject.get("userid");
        System.out.println(userid);
        CountryCode countryCode = CountryCode.valueOfCode(employeeObject.get("countryCode").toString());
        String email = (String) employeeObject.get("email");
        User.Builder userBuilder = new User.Builder(firstName, lastName, city, country, age, countryCode, email);
        userBuilder.withUserid(userid);

//        User newUser = new User(firstName, lastName, city, country, age, userid, countryCode, email);
        return userBuilder.build();

    }
}
