import java.util.*;
class perfectnum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert your number >> ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(sum == num) System.out.println(num + " is The Perfect Number");
		else if(sum < num) System.out.println(num + " is The Deficient Number");
		else if(sum > num) System.out.println(num + " is The Abundant Number");
	}
}
