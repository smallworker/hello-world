package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double wdir = 22.5;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			wdir = scanner.nextDouble();
			int winDirectionScale = ((int) wdir / 45) % 8;
			System.out.println(winDirectionScale > 0 ? winDirectionScale : -winDirectionScale);
		}
	}
	
}
