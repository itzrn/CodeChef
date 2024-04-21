package Starters130;

import java.util.Scanner;

public class SwappingMarksDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {

			int alice = sc.nextInt();
			int tempa = alice;
			int bob = sc.nextInt();
			int tempb = bob;
			int alicer = 0;
			int bobr = 0;

			while(alice!=0){
				alicer = alicer*10+alice%10;
				alice /= 10;
			}

			while(bob!=0){
				bobr = bobr*10+bob%10;
				bob /= 10;
			}
			
			if(tempa>tempb || tempa>bobr || alicer>tempb || alicer>bobr){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
    }
}
