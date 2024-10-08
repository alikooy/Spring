package codingbat.warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        // Get the front of the string (first 3 chars or the entire string if it's shorter)
        String front = str.length() < 3 ? str : str.substring(0, 3);

        // Create the result by repeating the front n times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(front);
        }
        return result.toString(); // Convert StringBuilder to String and return
    }
}
