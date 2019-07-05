class Bob {

    String hey(String message) {
        String response = "";
        message = message.trim();
        if (message.isEmpty()) {
            response = "Fine. Be that way!";
        } else if (message.matches("^[A-Z0-9\\s\\W]*$") && !message.matches("^[0-9\\s\\W]*$")) {
            if (message.contains("?")) {
                response = "Calm down, I know what I'm doing!";
            } else {
                response = "Whoa, chill out!";
            }
        } else if (message.matches("^[a-zA-Z\\s0-9\\W]*\\?$")) {
            response = "Sure.";
        } else {
            response = "Whatever.";
        }
        return response;
    }

}