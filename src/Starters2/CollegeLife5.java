package Starters2;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.*;

public class CollegeLife5{
	public static void main(String[] args) {
		int t = sc.nextInt();
	    while(t-- >0){
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] football = new int[n];
			int[] cricket = new int[m];

			for(int i = 0;i<n; i++){
				football[i] = sc.nextInt();
			}

			for(int i = 0;i<m; i++){
				cricket[i] = sc.nextInt();
			}

			int count = 0;
			int i = 0;
			int j = 0;

			boolean check = true;
			while(i<n && j<m){
				while(i<n && football[i]<cricket[j]){
					if(!check){
						count++;
						check = !check;
					}

					i++;
				}
				
				while(j<m && i<n && cricket[j]<football[i]){
					if(check){
						count++;
						check = !check;
					}

					j++;
				}
			}

			if(i<n && !check){
				count++;
			}

			if(j<m && check){
				count++;
			}

			System.out.println(count);
	    }
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

	static int mod = 1000000007;
	
	public static void swapIntegerInArray(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}


	public static void swapChar(char[] arr, int i, int j){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	public long combination(int m, int n){
		if(n>m-n){
			n = m-n;
		}

		long result = 1;
		for(int i=1; i<=n; i++){
			result *= m;
			result /= i;
			m--;
		}
		
		return result;
	}

	static boolean isPrime(long n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (long i = 6; i * i <= n; i += 6) {
            if ((n % (i - 1) == 0) || (n % (i + 1) == 0)) {
                return false;
            }
        }

        return true;
    }

	public static long gcd(long a, long b) {
        return b == 0L ? a : gcd(b, a % b);
    }

	public static void swapLongInArray(long[] a, int l, int r) {
        long temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

	public static void swapThreeCharInleftCircular(char[] str, int i, int j, int k){
		char x = str[k];
		str[k] = str[i];
		str[i] = str[j];
		str[j] = x;
	}

	public static void swapThreeCharInRightCircular(char[] str, int i, int j, int k){
		char x = str[i];
		str[i] = str[k];
		str[k] = str[j];
		str[j] = x;	
	}

	public static int highestPowerof2(int x) {
        x |= x >> 1;
        x |= x >> 2;
        x |= x >> 4;
        x |= x >> 8;
        x |= x >> 16;

        return x ^ (x >> 1);
    }

	static int[] readArrayInteger(int n) {
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

	static long[] readArrayLong(int n) {
        long[] a = new long[n + 1];

        for (int i = 1; i <= n; ++i) {
            a[i] = sc.nextLong();
        }

        return a;
    }

	// this collects all the prime factor of number n
	public static Hashtable<Integer,Integer> primeFactors(int n) {
		Hashtable<Integer,Integer> map = new Hashtable<>();
        while (n%2==0) {
			map.put(2,map.getOrDefault(2, 0)+1);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n%i == 0) {
                map.put(i,map.getOrDefault(i, 0)+1);
                n /= i;
            }
        }
		
        if (n > 2){
			map.put(n,map.getOrDefault(n, 0)+1);
		}


		return map;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	public static double myPow(int base, int exponent) { // this is the alternate of Math.pow in java to make compilation fast
        if(base == 0) return 0;
        if(exponent == 0) return 1;
        int absExponent = (exponent < 0)? exponent * -1 : exponent;
        double result = base;
        for(int i = 1; i < absExponent; i++) {
            result *= base;
        } 
        if(exponent < 1) result = 1 / result;
        return result;
    }

}
