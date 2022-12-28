package phoneNumbers;

/*
* Write a function that accepts an array of 10 integers (between 0 and 9),
*       that returns a string of those numbers in the form of a phone number.
* Example: Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
*/

public class PhoneNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(simplePhoneNumber(array));
    }

    public static String simplePhoneNumber(int[] array) {
        String number = "(xxx) xxx-xxxx";
        for (int i : array) {
            number = number.replaceFirst("x", Integer.toString(i));
        }
        return number;
    }
}
