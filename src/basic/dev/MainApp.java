package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("nhập n = ");
int n = sc.nextInt();
if (n>0 ) {
   System.out.println(n+" là số nguyên dương");
	}
else {
	System.out.println(n+" là số nguyên âm");
}
	}
}
