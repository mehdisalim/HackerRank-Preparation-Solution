import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < size; i++) {
            List<Integer> sublist = new ArrayList<Integer>();
            int ssize = scan.nextInt();
            for (int j = 0; j < ssize; j++) {
                sublist.add(scan.nextInt());
            }
            list.add(sublist);
        }
        int coord = scan.nextInt();
        
        for (int i = 0; i < coord; i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            if (list.size() <= x || list.get(x).size() <= y)
                System.out.println("ERROR!");
            else
                System.out.println(list.get(x).get(y));
        }
        
    }
}

