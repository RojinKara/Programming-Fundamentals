package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting {
    public Counting() {
    }

    public String readTextFile(String file) {
        StringBuilder print = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int count = 0;
            String line = reader.readLine();
            while (line != null) {
                count++;
                print.append(displayLine(line, count));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return print.toString();
    }

    public String displayLine(String line, int count) {
        return line + " : " + count + "\n";
    }
}
