// 입력값 -2 +2 범위의 정수를 출력해보세요
// 예 7 -> 5 6 7 8 9

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int n = input.nextInt();
		
		System.out.print(n -= 2);
		System.out.print(++n);
		System.out.print(++n);
		System.out.print(++n);
		System.out.print(++n);
	}
}