package com.itacademy.java.oop.basics;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

       String inputPassword = "qwertY123456";

       if (inputPassword.length() < 10) {
          System.out.println("A password must have at least ten characters.");
       }  if (missLettersOrDigits(inputPassword)) {
           System.out.println("A password consists of only letters and digits.");
       }  if (lessThenTwoDigits(inputPassword)) {
           System.out.println("A password must contain at least two digits.");
       }  if (hasNoUpperLowerCase(inputPassword)) {
           System.out.println("A password must contain upper and lower case letters.");
       } else {
           System.out.println("Password is valid: " + inputPassword);
       }
    }

    private static boolean missLettersOrDigits(String inputPassword) {
        String[] strings = inputPassword.split("");
        int countLetters = 0;
        int countDigits = 0;
        for (String symbol : strings) {
            if (symbol.matches("[0-9]*")) {
                countDigits++;
            } else if (symbol.matches("[a-zA-Z]*")) {
                countLetters++;
            }
        }
        if (countDigits > 0 && countLetters > 0) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean hasNoUpperLowerCase(String inputPassword) {
        if (inputPassword.toLowerCase().equals(inputPassword) || inputPassword.toUpperCase().equals(inputPassword)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean lessThenTwoDigits(String inputPassword) {
       String[] strings = inputPassword.split("");
       int count = 0;
        for (String symbol : strings) {
            if (symbol.matches("[0-9]*")) {
               count++;
            }
        }
        if (count < 2) {
            return true;
        } else {
            return false;
        }
    }
    }

