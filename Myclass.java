import java.util.Scanner;

public class Myclass {

	private int ARRAY_SIZE=10;
	private int[] array = new int[ARRAY_SIZE];
	private int i = -1;
	
	public void load() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Do you want to enter number(Y or N):");
		
		String decision = scan.next();
		while(decision.equalsIgnoreCase("Y")) {
			System.out.print("Enter the number");
			i++;
			array[i]=scan.nextInt();
			System.out.println("Do you want to enter another number(Y or N):");
			decision = scan.next();
		}
		if(!decision.equalsIgnoreCase("Y")) {
			scan.close();
		}
	}
	
public void printChart() {
	for (int i =0;i<array.length;i++) {
		System.out.println();
		for (int j =0; j<array[i];j++) {
			System.out.print("Nothing");
		}
	}
}

}
