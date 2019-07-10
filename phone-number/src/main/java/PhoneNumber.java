package main.java;

import java.util.regex.Pattern;

public class PhoneNumber {
    String phoneNumber;
    String error;
    private static String wrongLengthExceptionMessage = "incorrect number of digits";
    private static String moreThan11DigitsExceptionMessage = "more than 11 digits";
    private static String numberIs11DigitsButDoesNotStartWith1ExceptionMessage = "11 digits must start with 1";
    private static String illegalCharacterExceptionMessage = "letters not permitted";
    private static String illegalPunctuationExceptionMessage = "punctuations not permitted";
    private static String areaCodeStartsWithZeroExceptionMessage = "area code cannot start with zero";
    private static String areaCodeStartsWithOneExceptionMessage = "area code cannot start with one";
    private static String exchangeCodeStartsWithZeroExceptionMessage = "exchange code cannot start with zero";
    private static String exchangeCodeStartsWithOneExceptionMessage = "exchange code cannot start with one";

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber.replaceAll("[\\+\\.\\s-\\p{Ps}\\p{Pe}]", "");
        String errorMessage = getErrorMessage();
        if (errorMessage != "") {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public String getErrorMessage() {
        error = (error = validateCharacters()) == "" ? (error = validateLength()) == "" ? validateCode() : error
                : error;
        return error;
    }

    String validateCharacters() {
        error = Pattern.compile("\\W").matcher(phoneNumber).find() ? illegalPunctuationExceptionMessage
                : (Pattern.compile("[A-Za-z]").matcher(phoneNumber).find() ? illegalCharacterExceptionMessage : "");
        return error;
    }

    String validateLength() {
        if (phoneNumber.length() > 10) {
            if (phoneNumber.length() == 11) {
                if (!phoneNumber.startsWith("1")) {
                    error = numberIs11DigitsButDoesNotStartWith1ExceptionMessage;
                } else {
                    phoneNumber = phoneNumber.substring(1);
                }
            } else {
                error = moreThan11DigitsExceptionMessage;
            }
        }
        if (phoneNumber.length() < 10) {
            error = wrongLengthExceptionMessage;
        }
        return error;
    }

    String validateCode() {
        if (phoneNumber.charAt(0) == '0') {
            error = areaCodeStartsWithZeroExceptionMessage;
        } else if (phoneNumber.charAt(0) == '1') {
            System.out.println("yes");
            error = areaCodeStartsWithOneExceptionMessage;
        } else if (phoneNumber.charAt(3) == '1') {
            error = exchangeCodeStartsWithOneExceptionMessage;
        } else if (phoneNumber.charAt(3) == '0') {
            error = exchangeCodeStartsWithZeroExceptionMessage;
        }
        return error;
    }

    public String getNumber() {
        return phoneNumber;
    }
}
