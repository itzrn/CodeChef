package Starters2;

import java.util.Scanner;

public class PossibleVictory {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int o = sc.nextInt();
		int c = sc.nextInt();
		
		o = 20-o;
		r = r-c;
		
		if(r<o*36){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}
