package hello;

import java.util.Scanner;

public class Hello {

	public Hello() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
//		Scanner in = new Scanner(System.in);
//		System.out.println("echo"+in.nextInt());
//		int price = 0;
//		final int amout =100;//
//		price = in.nextInt();
//		amout = in.nextInt();
//		System.out.println(in.nextLine());
//		System.out.println(amout+"-"+price+"="+(amout-price));
//		System.out.println(amout);
//		System.out.println(price);
//		in.close();
		int foot;
		int inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((foot+inch/12.0)*0.3048);
		in.close();
	}
}
