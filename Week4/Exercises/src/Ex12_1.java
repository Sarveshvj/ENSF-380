import java.util.Arrays;
import java.util.regex.* ;

public class Ex12_1 {
    public static void main(String[] args) {
        String myString = "ENSF Principles of Software Development";
        myRegularExpression(myString);
        splitStr(myString);
        SB(myString);
    }

    public static void myRegularExpression(String inputStr) {
        Pattern findE = Pattern.compile("e", Pattern.CASE_INSENSITIVE);
        Matcher myMatcher = findE.matcher(inputStr);
        int matchCount = 0;
        while (myMatcher.find())
            matchCount++;
        System.out.println(matchCount);
    }

    public static void splitStr(String inputStr) {
        String[] tokenizedArray = inputStr.split(" ", 0);
        System.out.println("No.of Tokens: " + tokenizedArray.length);
        System.out.println(Arrays.toString(tokenizedArray)); // prints the list of words

        for(String values: tokenizedArray) {
            System.out.println(values);
        }
    }

    public static void  SB(String inputStr) {
        StringBuilder myStr1 = new StringBuilder(inputStr);
        myStr1.insert(4, ":");
        System.out.println(myStr1.toString());
    }
}
