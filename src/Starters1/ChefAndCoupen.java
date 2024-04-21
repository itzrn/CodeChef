package Starters1;

import java.util.Scanner;

public class ChefAndCoupen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int d = sc.nextInt();
		    int c = sc.nextInt();
		    
		    int day1 = sc.nextInt() + sc.nextInt() + sc.nextInt();
		    int day2 = sc.nextInt() + sc.nextInt() + sc.nextInt();
		    
		    
		    if(day1>=150 && day2>=150){
		        if(2*d <= c){
		            System.out.println("NO");
		        }else{
		            System.out.println("YES");
		        }
		    }else if(day1>=150 || day2>=150){
		        if(c+d >= 2*d){
		            System.out.println("NO");
		        }else{
		            System.out.println("YES");
		        }
		    }else{
		        System.out.println("NO");
		    }
		}
    }
}
