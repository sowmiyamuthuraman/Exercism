import java.util.Arrays;
import java.util.stream.*;
import java.util.regex.*;

class LargestSeriesProductCalculator {
    String inputNumber;
    String errorMsg;
    public static final String NEGATIVE_SERIES_SIZE = "Series length must be non-negative.";
    public static final String CONTAINS_ALPHABETS = "String to search may only contain digits.";
    public static final String LARGE_SERIES_SIZE = "Series length must be less than or equal to the length of the string to search.";

    LargestSeriesProductCalculator(String inputNumber) {
        if (Pattern.compile("[A-za-z]").matcher(inputNumber).find()) {
            throw new IllegalArgumentException(CONTAINS_ALPHABETS);
        }
        this.inputNumber = inputNumber;
        errorMsg = "";
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (!isValidSeriesLength(numberOfDigits)) {
            throw new IllegalArgumentException(errorMsg);
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i <= inputNumber.length() - numberOfDigits; i++) {
            String substring = inputNumber.substring(i, i + numberOfDigits);
            int product = substring.chars().map(s -> s - 48).reduce(1, Math::multiplyExact);
            if (product > max) {
                max = product;
            }
        }
        return max;

    }

    boolean isValidSeriesLength(int numberOfDigits) {
        boolean isValid;
        errorMsg = numberOfDigits < 0 ? NEGATIVE_SERIES_SIZE
                : numberOfDigits > inputNumber.length() ? LARGE_SERIES_SIZE : errorMsg;
        isValid = errorMsg == "" ? true : false;
        return isValid;
    }
}
