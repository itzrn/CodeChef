package Starters2;

import java.util.Scanner;

public class ServerTrouble {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    if(n%k == 0){
		        System.out.println(n/k + " " +k);
		    }else{
		        System.out.println((n/k)+1 + " " + n%k);
		    }
		}

	}
}
