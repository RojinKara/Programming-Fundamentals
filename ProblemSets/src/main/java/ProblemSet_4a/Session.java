package ProblemSet_4a;

public class Session {
	private String sessionName = null;
	private int startTime = 0;
	private int endTime = 0;
	public Session(String sessionName, int startTime, int endTime) {
		super();
		this.sessionName = sessionName;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public String getSessionName() {
		return this.sessionName;
	}
	public int getStartTime() {
		return this.startTime;
	}
	public int getEndTime() {
		return this.endTime;
	}
}
