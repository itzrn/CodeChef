package Starters126;
import java.util.*;

public class FreeDom {
    public static long solve(long[] arr, int n){
		Map<Long, Integer> map = new Hashtable<>();
		long count = 0;
		for(int i = 0; i<n; i++){
			if(arr[i] != 1 && (arr[i]*3)%(arr[i]-1) == 0){
				count += map.getOrDefault((arr[i]*3)/(arr[i]-1), 0);
			}

			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		return count;
	}
}


/*
 * This is a property of AP
 * x = ai-aj
 * y = ai+aj
 * z = ai*aj
 * 
 * 2y = x+z
 *     ^
 *     |
 *     |
 * 
 * 2*(ai + aj) = (ai - aj) + (ai*aj)
 * 2*(a+b) = (a-b) + (a*b)
 * 2a + 2b = a-b + ab
 * a + 3b = a*b
 * 3b = ab-a
 * 3b = a(b-1)
 * a = 3b/(b-1) 
 * this is the main crucks of the problem, we have to come to a mathematical approach then need to use prefix approach
 */
