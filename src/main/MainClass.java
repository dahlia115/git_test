package main;

import java.util.Scanner;

import login.Login;

public class MainClass {
	public static void main(String[] args) {
		//kim - �α���
		//cho - ȸ������
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("1.�α��� 2.ȸ������");
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