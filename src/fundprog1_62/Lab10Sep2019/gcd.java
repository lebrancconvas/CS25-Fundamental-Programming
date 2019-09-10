import java.util.*;
class gcd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int p , q;
		int t;
		if(x > y) {
			p = x;
			q = y;
		} else {
			p = y;
			q = x;
		}

		for(;q != 0;) {
			t = q;
			q = p % q;
			p = t;
		}

		System.out.println(p);
	}
}
