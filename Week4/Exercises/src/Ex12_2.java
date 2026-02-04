import java.util.regex.*;

public class Ex12_2 {
    public static void main(String[] args) {
        Ex12_2 myObject = new Ex12_2();
        // Print out examples from addTogether.
        String oneExample = "12 4 6789";
        String twoExample = "abcdef gh";
        int theLength = myObject.addTogether(oneExample,twoExample);
        System.out.println(theLength);

        // Length is unchanged by adding whitespace to front and back
        oneExample = "   " + oneExample + "\n";
        twoExample = "\t" + twoExample;
        theLength = myObject.addTogether(oneExample,twoExample);
        System.out.println(theLength);

        // Print out example of idProcessing
        String personFirst = "Dorothy";
        String personLast = "Gale";
        String petName = "Toto";
        int petBirth = 1899;
        String theID = myObject.idProcessing(personFirst,personLast,
                petName,petBirth);
        System.out.println(theID);

        // Print out examples from secretCode
        String ingredientOne = "tomato";
        String ingredientTwo = "WATER";
        String theCode = myObject.secretCode(ingredientOne);
        System.out.println(theCode);
        theCode = myObject.secretCode(ingredientTwo);
        System.out.println(theCode);
    }

    private static final Pattern SECRET_CODE_REGEX = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);

    public static Pattern getSecretCodeRegex() {
        return SECRET_CODE_REGEX;
    }

    public static int addTogether(String myStr1, String myStr2) {
        String combined = myStr1.trim() + myStr2.trim();
        return combined.length();
    }

    public static String idProcessing(String firstName, String lastName, String petName, int year) {
        String id = String.valueOf(firstName.charAt(0)) + lastName.charAt(0) + petName.charAt(0) + year;
        return id;
    }

    public static String secretCode(String myStr) {
        Matcher myMatcher = SECRET_CODE_REGEX.matcher(myStr);
        String secret = myMatcher.replaceAll("z");
        return secret.substring(0, 3);
    }
}
