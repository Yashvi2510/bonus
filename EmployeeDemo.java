import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("enter name:");
		String name = input.nextLine();
		System.out.println("enter hours:");
		double hour = input.nextDouble();
		Employee em = new Employee(name,hour);
		System.out.println("the total pay :" + em.getTotalPay());
	}

}
