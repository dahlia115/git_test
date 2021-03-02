package main;

import java.util.Scanner;

import login.Login;

public class MainClass {
	public static void main(String[] args) {
		//kim - 로그인
		//cho - 회원관리
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("1.로그인 2.회원관리");
			num = sc.nextInt();
			switch (num) {
			case 1:
				Login l = new Login();
				l.login();
				break;
			case 2:
				break;
				
				
			}
			
		}
	}
}