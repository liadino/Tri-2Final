package liaFinal;
import java.util.Scanner;

public class Main {
	public static int role;
	public static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
	    Player x = new Offensive();
	      x.playVolleyball();
	      x.getPurpose();
	      x.getPosition();
	      Offensive i = new Hitter();
		    ((Hitter) i).getPurpose();
	      ((Hitter) i).getPosition();


	}
	private void welcome() {
		System.out.println("Hi! Welcome to the Volleybal Starter Assistant!");
		System.out.println("Are you (1) a beginner player or (2) a beginner coach?");
		 role = input.nextInt();
	}

}
