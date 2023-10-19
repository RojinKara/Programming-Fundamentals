package ProblemSet_4a;

public class Day {
	private String name;
	private Session[] sessions;
	public Day(String name) {
		this.name = name;
		this.sessions = new Session[4];
	}
	public String getName() {
		return this.name;
	}
	public void setSession(int index, String moduleName,
			int startTime, int endTime) {
		this.sessions[index] =
				new Session(moduleName, startTime, endTime);
	}
	public Session getSessions(int index) {
		return this.sessions[index];
	}
	@Override
	public String toString() {
		String temp = "";
		for (int i = 0; i < this.sessions.length; i++) {
			if (this.sessions[i] != null) {
				temp += this.sessions[i].getSessionName()
					+ ": "
					+ this.sessions[i].getStartTime() + " - "
					+ this.sessions[i].getEndTime() + "\n";
			}
		}
		return temp;
	}
}
