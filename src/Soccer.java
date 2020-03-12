
public class Soccer extends Player {
	private int goals;
	private int wins;
	private String colorOfJersey;
	public Soccer(String name, String team, int age, int goals, int wins, String colorOfJersey) {
		super(name, team, age);
		this.goals = 19;
		this.wins = 4;
		this.colorOfJersey = "blue and red";
	}
}
