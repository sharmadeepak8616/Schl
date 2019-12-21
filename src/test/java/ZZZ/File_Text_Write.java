package ZZZ;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_Text_Write {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("./abc.txt", true);
        PrintWriter pWriter = new PrintWriter(writer);

        pWriter.printf("%s"+"%n" , "Write this in file");

        pWriter.close();
    }
}
