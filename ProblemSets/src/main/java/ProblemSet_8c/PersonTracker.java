package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonTracker {
    private List<Person> peopleList = null;

    public PersonTracker() {
        this.peopleList = new ArrayList<Person>();
    }

    public String displayList() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < this.peopleList.size(); i++) {
            temp.append(this.peopleList.get(i).toString()).append("\n");
        }
        return temp.toString();
    }

    public String readTextFile(String file) {
        StringBuilder print = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                print.append(line).append("\n");
                breakLine(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return print.toString();
    }

    private void breakLine(String line) {
        String[] parts = line.split(" ");
        addPerson(parts[0], parts[1], Integer.parseInt(parts[2]));
    }

    public void addPerson(String n, String s, int a) {
        this.peopleList.add(new Person(n, s, a));
    }

    public String getPeopleList() {
        return this.peopleList.toString();
    }
}
