package CreateTeacherAccount;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteInFile {

    private String path;
    private boolean appendToFile = true;

    public WriteInFile(String filePath) {
        path = filePath;
    }

    public void writeToFile(String textLine) {
        FileWriter write;
        try {
            write = new FileWriter(path, appendToFile);
            PrintWriter printLine = new PrintWriter(write);
            printLine.printf("%s" + "%n" ,  textLine);
            printLine.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



}
