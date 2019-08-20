import java.util.*;

class score
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Input your Lab1 score -> ");
		int lab1score = sc.nextInt();

		System.out.print("Input your Lab2 score -> ");
		int lab2score = sc.nextInt();

		System.out.print("Input your Final score -> ");
		int finalscore = sc.nextInt();

		int totalscore;

		if(lab1score > lab2score) {
			totalscore = lab1score + finalscore;
		} else {
			totalscore = lab2score + finalscore;
		}

		System.out.println("Your total score is " + totalscore);
	}
}
