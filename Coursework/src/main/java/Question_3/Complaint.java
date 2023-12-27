package Question_3;

public class Complaint {
    private String title = null;
    private Severity severity = null;

    public Complaint(String title, Severity severity) {
        super();
        this.title = title;
        this.severity = severity;
    }

    public Severity getSeverity() {
        return this.severity;
    }
}
