package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cislo; 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Zadaj cislo");
		cislo = sc.nextInt();
		
		if (cislo<10) {
			System.out.println("Zadane cislo je mensie ako 10");
		}else{
			System.out.println("Zadane cislo je vacsie ako 10");
		}
		

	}
	}
