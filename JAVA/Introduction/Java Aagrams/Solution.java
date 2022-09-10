import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] c1 = a.toLowerCase().toCharArray();
        int c1Size = 0;
        char[] c2 = b.toLowerCase().toCharArray();
        int c2Size = 0;
        for (int i = 0; i < c1.length; i++)
            c1Size += c1[i];
        for (int i = 0; i < c2.length; i++)
            c2Size += c2[i];
        if (c1Size == c2Size && checkSize(c1, c2))
            return true;
        return false;
        
    }

    static boolean checkSize(char[] c1, char[] c2){
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                if (c1[i] != c2[j] && j+1 == c2.length)
                    return false;
                if (c1[i] == c2[j]) {
                    c2[j] = '@';
                    break;
                }
            }
        }
        return true;   
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
