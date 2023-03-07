import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        int hours = Integer.valueOf(s.substring(0, 2)) + 12;
        if (s.substring(s.length() - 2).equals("PM") && hours == 24)
            return (s.substring(0, s.length() - 2));
        if (hours >= 24)
            return ("00".concat(s.substring(2, s.length() - 2)));
        if (s.substring(s.length() - 2).equals("AM"))
            return (s.substring(0, s.length() - 2));
        return (String.valueOf(hours).concat(s.substring(2, s.length() - 2)));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

