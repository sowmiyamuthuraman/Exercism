class LuhnValidator {

    boolean isValid(String candidate) {
        int digitSum = 0;
        boolean isValid = false;
        candidate = candidate.replaceAll(" ", "");
        if (candidate.matches("[0-9\\s]{2,}")) {
            if (candidate.matches("^0{1}[0-9]+$") && candidate.length() % 2 != 0) {
                candidate = candidate.substring(1);
            }
            for (int i = 0; i < candidate.length(); i++) {
                if (Character.isDigit(candidate.charAt(i))) {
                    if (i % 2 == 0) {
                        int temp = 2 * (candidate.charAt(i) - '0');
                        digitSum += temp > 9 ? temp - 9 : temp;
                    } else {
                        digitSum += (candidate.charAt(i) - '0');
                    }
                }
            }
            if (digitSum % 10 == 0) {
                isValid = true;
            }
        }
        return isValid;

    }
}
