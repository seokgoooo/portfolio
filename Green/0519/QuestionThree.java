// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 -> true,1557 -> false,9009 -> true
import java.util.Scanner;

public class QuestionThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("4자리의 정수를 입력하시오: ");
		int number = input.nextInt();
		
		// boolean result = (number % 10) == (number / 1000);
		
		System.out.println("좌우가 같은 수인가? " + ((number % 10) == (number / 1000)));
	}
}