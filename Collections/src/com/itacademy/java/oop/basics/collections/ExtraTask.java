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
        //TODO: Create User list and add all Users.
        List<User> newUsersList = createUserList();
        System.out.println("New Users list:");
        printList(newUsersList);
        System.out.println();
        //TODO: Order list from youngest user to oldest (Use Custom Comparator).
        List<User> sortedByAge = sortFromYoungestToOldest(newUsersList);
        System.out.println("List sorted from youngest user to oldest:");
        printList(sortedByAge);
        System.out.println();
        //TODO: Filter list by userId > 10000.  (Use Stream)
        List<User> filteredByUserid = filterListByUserId(newUsersList);
        System.out.println("Filtered list by userId:");
        printList(filteredByUserid);
        System.out.println();
        //TODO: Find the Oldest and the Youngest user.
        User youngest = findYoungest(newUsersList);
        System.out.println("Youngest user: " + youngest);
        System.out.println();
        User oldest = findOldest(newUsersList);
        System.out.println("Oldest user: " + oldest);
    }

    private static void printList(List<User> list) {
        for (User user : list) {
            System.out.println(user);
        }
    }

    private static User findYoungest(List<User> newUsersList) {
        User youngest = newUsersList.stream().min(Comparator.comparing(User::getAge)).orElseThrow();
        return youngest;
    }

    private static User findOldest(List<User> newUsersList) {
        User oldest = newUsersList.stream().max(Comparator.comparing(User::getAge)).orElseThrow(NoSuchElementException::new);
        return oldest;
    }

    private static List<User> filterListByUserId(List<User> newUsersList) {
        List<User> filteredByUserid = newUsersList.stream().filter(user -> Objects.nonNull(user.getUserid())).filter(user -> user.getUserid() > 10000).collect(Collectors.toList());
        return filteredByUserid;
    }

    private static List<User> sortFromYoungestToOldest(List<User> newUsersList) {
        List<User> sortedByAge = newUsersList.stream().sorted(new UserAgeComparator()).collect(Collectors.toList());
        return sortedByAge;
    }

    private static List<User> createUserList() {
        List<User> newUsersList = new ArrayList<User>();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("src/resources/users.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray usersList = (JSONArray) obj;
            usersList.forEach(user -> newUsersList.add(parseEmployeeObject((JSONObject) user)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newUsersList;
    }

    private static User parseEmployeeObject(JSONObject user) {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) user.get("user");
        //Convert JSONObject to User
        User convertedUser = UserConverter.convertUser(employeeObject);
        return convertedUser;

    }
}
