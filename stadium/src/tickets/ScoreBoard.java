package tickets;

public class ScoreBoard {
	private int currentAttendance;
	
	public ScoreBoard() {
		currentAttendance = 0;
	}
	
	public int getAttendance() {
		return currentAttendance;
	}
	
	public void tookATicket() {
		currentAttendance++;
	}
}
