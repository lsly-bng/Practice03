package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num=sc.nextInt();
		int sum=0;
		
		for (int i=1; i<=num; i++) {
			sum+=i;
			if (i<num) {
				System.out.print(i+"+");
			}
			else {
			System.out.println(i);
			}
		}
		System.out.println("결과값: "+sum);
		
		sc.close();
	}
}
