// 입력 : 정수가 0이상이며 7의 배수 일때 출력 : true
import java.util.Scanner;

public class QuestionOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int number = input.nextInt();
					
		// boolean result = (number >= 0) && (number % 7 == 0);
		
		System.out.println("0이상이며 7의 배수인가? " + ((number >= 0) && (number % 7 == 0)));
	}
}

// 1. 사용자가 입력한 정수가 0이상이며 7의 배수일 때만 true를 출력하세요. 나머지 경우는 false

// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true을 출력하세요. 나머지 경우는 false
// 예) 1 2 3 -> true,4 5 6 -> true,7 9 10 -> false

// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 -> true,1557 -> false,9009 -> true


// 오늘한 것
// 기본형(원시형) 데이터 타입
// 정수형, 실수형, 논리형, 문자형

// 변수 두 개의 값 교환
// 복합대입연산자
// 증감연산자
// 관계연산자
// 논리연산자