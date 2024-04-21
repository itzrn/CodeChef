package Starters1;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class MaximumValue {
    public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			int[]arr = new int[n];

			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);
			System.out.println(Math.max(eval(arr[0], arr[1]), eval(arr[n-1], arr[n-2])));
		}
    }

	static long eval(int a, int b) {
	    return a*b + Math.abs(a-b);
	}
	
	static FastReader sc = new FastReader();
	static class FastReader{
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() { 
			br = new BufferedReader( 
				new InputStreamReader(System.in)); 
		} 

		String next() { 
			while (st == null || !st.hasMoreElements()) { 
				try { 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) { 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() { 
			return Integer.parseInt(next()); 
		} 

		long nextLong() { 
			return Long.parseLong(next()); 
		} 

		double nextDouble() { 
			return Double.parseDouble(next()); 
		} 

		String nextLine() { 
			String str = ""; 
			try { 
				if(st.hasMoreTokens()){ 
					str = st.nextToken("\n"); 
				} 
				else{ 
					str = br.readLine(); 
				} 
			} 
			catch (IOException e) { 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	} 
}
