package in.project.kattisfs.task2;

import java.util.Scanner;

public class ExamplePizzaTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number num1 : ");
		double num1 = scan.nextInt();

		System.out.println("Enter First Number num2 : ");
		double num2 = scan.nextInt();

		//execution
		System.out.printf("%.6f", 100 * ((num1 - num2) * (num1 - num2)) / (num1 * num1));

		scan.close();
	}

}