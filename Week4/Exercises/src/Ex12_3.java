import java.util.regex.*;

public class Ex12_3 {
    public static void main(String[] args) {
        String myStr1 = "3 Jan 2022";
        System.out.println(normalizeDate(myStr1));
    }

    public static String normalizeDate(String myStr) {
        if(myStr == null) return "";

        Pattern ymd = Pattern.compile("^(\\d{4})[.-](\\d{1,2})[.-](\\d{1,2})$");
        Pattern dmy = Pattern.compile("^(\\d{1,2})[.-](\\d{1,2})[.-](\\d{4})$");

        Matcher myMatcher1 = ymd.matcher(myStr);
        if(myMatcher1.matches()) {
            return String.format("%s-%02d-%02d", myMatcher1.group(1), Integer.parseInt(myMatcher1.group(2)),
                    Integer.parseInt(myMatcher1.group(3)));
        }

        Matcher myMatcher2 = dmy.matcher(myStr);
        if(myMatcher2.matches()) {
            return String.format("%s-%02d-%02d", myMatcher2.group(3), Integer.parseInt(myMatcher2.group(2)),
                    Integer.parseInt(myMatcher2.group(1)));
        }
        return "";
    }
}
