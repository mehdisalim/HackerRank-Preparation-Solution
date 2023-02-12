import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    
    public static int get_largest_number(List<Integer> tab){
        int largest = tab.get(0);
        for (int i = 0; i < tab.size(); i++) {
            if (largest < tab.get(i))
                largest = tab.get(i);    
        }
        return largest;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        List<Integer> tab = new ArrayList<>();
        for(int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++) {
                if (j < 4 && i < 4){
                    int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                    sum += arr.get(i + 1).get(j + 1);
                    sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                    tab.add(sum);
                }
            }
        }
        System.out.println(get_largest_number(tab));
        bufferedReader.close();
    }
}

