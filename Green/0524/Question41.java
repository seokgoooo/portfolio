import java.util.Scanner;
public class Question41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 수를 알고 싶은가요? ");
		int input = sc.nextInt();

		boolean on = true;
		if (input > 1) {
				for (int i = 2; i < input; i++) {
					
					if (input % i == 0) {
						
						System.out.print(input + " : 소수가 아닙니다.");
						on = false;
						break;
						
					}
					
				}
		
				if (on) {
					
					System.out.print(input + " : 소수입니다.");
					on = false;
					
					}
					
		}

		else {
			System.out.print("다시 실행하세요");
		}
	}
}