import java.util.*;

class  worksalary
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double totalsalary;

		System.out.print("Type your ID. -> ");
		int id = sc.nextInt();

		System.out.print("Type your workhours per week -> ");
		double workhrperweek = sc.nextDouble();

		System.out.print("Type your wage per hour -> ");
		double wageperhour = sc.nextDouble();
		
		if(workhrperweek > 40) {
			totalsalary = (40*wageperhour) + ((workhrperweek - 40) * 1.5 * wageperhour);
		} else {
			totalsalary = (workhrperweek * wageperhour);
		}

		System.out.println("Your ID. "+ id +" Your Salary is " + totalsalary + " Baht.");
	}
}
