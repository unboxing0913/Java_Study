package part01.sec01.exam01;

import java.util.Scanner;

public class Exercise05 {
	
	public static void main(String[] args) {
		
		boolean run =true;
		int balance = 0;
		//int don;
		Scanner s = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			int num = s.nextInt();
			
			
			switch(num) {
			case 1:
				System.out.print("예금액 > ");
				//don = s.nextInt();
				//balance = balance + don;
				balance+=s.nextInt();
			    break;
			case 2:
				System.out.print("출금액 > ");
				//don = s.nextInt();
				//balance = balance - don;
				balance-=s.nextInt();
				break;
			case 3:
				System.out.print("잔고 > ");
				System.out.println(balance);
				break;
			case 4:
				System.out.println("프로그램 종료.");
				run=false;
				break;
			
			default:
				System.out.println("잘못입력했습니다. 다시입력해주세요.");
				continue;
			
			}s.close();
		}
		
		
		
	}
}
