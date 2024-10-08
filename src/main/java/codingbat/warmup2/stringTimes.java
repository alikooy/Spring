package codingbat.warmup2;

public class stringTimes {
    public String stringTimes(String str, int n) {
        // Return a new string that is n copies of the original string
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficiency
        for (int i = 0; i < n; i++) {
            result.append(str); // Append the original string n times
        }
        return result.toString(); // Convert StringBuilder to String
    }
}
