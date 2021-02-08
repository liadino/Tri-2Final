package liaFinal;

public class Main {

	public static void main(String[] args) {
	    Player x = new Offensive();
	      x.playVolleyball();
	      x.getPurpose();
	      x.getPosition();
	      Offensive i = new Hitter();
		    ((Hitter) i).getPurpose();
	      ((Hitter) i).getPosition();


	}

}
