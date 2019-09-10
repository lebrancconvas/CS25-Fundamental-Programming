import java.util.*;
class primeloop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int check = 1;
		for(int n = 1; n <= max; n++) {
			if(n == 1) {
				check = 0;
			} else {
				for(int i = 2; i < n; i++) {
					if(n % i == 0) {
						check = 0;
						break;
					} else {
						check = 1;
					}
				}
			}
			if(check == 0) System.out.println(n + " is not prime number.");
			else if(check == 1) System.out.println(n + " is prime number.");
		}
  }
}