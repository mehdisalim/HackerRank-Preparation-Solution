/*
 *          #######     #####    ##         ##   ####    ####         
 *         ########     #####    ##         ##   ####    ####         
 *         ###          #####    ##         ##   #####  #####         
 *         #####       ### ###   ##         ##   #####  #####         
 *         ########    ### ###   ##         ##   ## ###### ##         
 *          ########   ### ###   ##         ##   ## ###### ##         
 *            ######  ###   ###  ##         ##   ## ###### ##         
 *               ###  #########  ##         ##   ##  ####  ##         
 *               ### ####   #### ##         ##   ##  ####  ##         
 *         ######### ###     ### ##         ##   ##        ##         
 *         ########  ###     ### ########   ##   ##        ##         
 *
 *              M   E   H   D   I       S   A   L   I   M
 *
 * @CreatedBy : SALIM MEHDI
 * @Date : 29/04/2022
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        int multiplenum = 0;
        while (++multiplenum <= 10)
            System.out.println(N+" x "+multiplenum+" = "+(N * multiplenum));

        bufferedReader.close();
    }
}

