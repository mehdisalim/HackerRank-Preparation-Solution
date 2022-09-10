import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int len = s1.length();
                System.out.print(s1);
                while (len < 15)
                {
                    System.out.print(" ");
                    len++;
                }
                if (x < 100 && x > 9)
                    System.out.println("0" + x);
                else if (x < 10)
                    System.out.println("00" + x);
                else
                    System.out.println(x);
            }
            System.out.println("================================");

    }
}

