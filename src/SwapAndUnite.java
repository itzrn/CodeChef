package src;

/**
 *You have a string S consisting of lowercase letters.
 *
 * You can perform the following operation on S: Choose two indices i and j (1≤i<j≤∣S∣), and swap Si and Sj
 * For example, if S=codechef, choosing i=3 and j=6 results in the string cohecdef.
 *
 * You've always liked unity. To this end, find the minimum number of operations required so that for at least one character that appears in S,
 * all its occurrences form a contiguous segment in S — in short, are united.
 *
 * For example, if S=baaba, swapping the first and third characters results in S=aabba.
 * All the occurrences of 'b' form a contiguous segment now. Note that the 'a's don't form a contiguous segment, which is fine.
 *
 * Input Format
 * The first line of input will contain a single integer T, denoting the number of test cases.
 * Each test case consists of one line of input, containing a string S.
 *
 * Output Format
 * For each test case, output the minimum number of operations required to unite at least one character in the given string.
 *
 * Constraints
 * 1≤T≤2*10^4
 * 1≤∣S∣≤2*10^5
 * Si is a lowercase letter, i.e, between 'a' and 'z'.
 * It is guaranteed that the sum of ∣S∣ over all test cases won't exceed ≤ 2*10^5.
 *
 * Sample 1:
 * Input
 * 4
 * aba
 * abab
 * baabba
 * ppssppss
 *
 * Output
 * 0
 * 1
 * 1
 * 2
 *
 * Explanation:
 * Test case 1: For S=aba, all occurrences of b already form a contiguous segment, so no operations are needed.
 *
 * Test case 2: For S=abab. Swap the first and second characters to obtain baab.
 * All the 'a's are now together.
 *
 * Test case 3: We have S=baabba. Swap the first and third characters to obtain aabbba.
 * All the 'b's are now together.
 */

import java.util.Scanner;

public class SwapAndUnite {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            char[] arr = sc.nextLine().toCharArray();
            System.out.println(solve(arr, arr.length));

        }

    }

    public static int solve(char[] str, int len){
        int[] arr = new int[26];
        for(char i:str){ // counting the frequency of each character
            arr[i-'a']++;
        }

        int min = len;
        for(int i = 0; i<26; i++){ // for every character
            if(arr[i] != 0){ // is there frequency
                //using -> sliding window with fixed length of arr[i]
                // calculating the number of time that particular character present, the maximum present the lesser operations need to perform
                int x = 0;
                int y = 0;
                int max = 0;
                int count = 0;

                while(y<len){
                    if(str[y]-'a' == i){
                        count++;
                    }
                    if(y-x+1 == arr[i]){
                        max = Math.max(max, count);
                        if(str[x]-'a' == i){
                            count--;
                        }
                        x++;
                    }
                    y++;
                }

                min = Math.min(min, arr[i]-max);
            }
        }

        return min;
    }
}
