// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인 메소드에서 호출하여 출력을 통해 값을 확인해보세요.
import java.util.Scanner;
public class Question1 {
	public static double area(double r) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요: ");
		r = sc.nextDouble();
		
		return r * r * 3.14;
	}
	
	public static void main(String[] args) {
		double r = 0;
		System.out.println("원의 넓이는 : " + area(r));
	}
}

// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인 메소드에서 호출하여 출력을 통해 값을 확인해보세요.

// 2. 전달받은 정수만큼 "안녕"이라는 문자열을 출력하는 메소드. (return type : void)

// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.

// 4. 키(실수, 미터단위)와 몸무게(실수, kg단위)를 전달받아
// 한국기준 BMI 지수(실수) 구해 반환하는 메소드
// BMI = (몸무게) / (키)^2