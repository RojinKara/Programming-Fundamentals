package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting {
    /**
     * Creates the Counting object.
     */
    public Counting() {
        super();
    }

    /**
     * Reads the TextFile and returns text and Line numbers.
     *
     * @param file
     * @return text and Line Numbers
     * @throws RuntimeException if the file can't be opened
     */

    public String readTextFile(String file) throws RuntimeException {
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

    /**
     * Formats the line.
     *
     * @param line
     * @param counter
     * @return line : number
     */

    public String displayLine(String line, int counter) {
        return line + " : " + counter + "\n";
    }
}
