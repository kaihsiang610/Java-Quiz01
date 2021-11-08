import java.util.Scanner;

class is_prime {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	boolean judge = false;

	void show() {
		for (int n = 2; n <= (x / 2); n++) {
			if (x % n == 0) {
				System.out.println("NO");
				break;
			}
		}
		if (judge == false) {
			System.out.println("YES");
		}
	}
}

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		is_prime prime = new is_prime();
		prime.show();
	}
}