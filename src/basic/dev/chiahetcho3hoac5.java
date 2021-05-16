package basic.dev;

import java.util.Scanner;

public class chiahetcho3hoac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.print("nhập n = ");
     int n = sc.nextInt();
     if (n % 3==0 || n%5==0){
    	 System.out.println("chia hết");
    	 
     }else {
    	 System.out.println("không chia hết");
     }

	}

}
