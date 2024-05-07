package Ex5;

import java.io.*;
import java.util.Date;
public class FileService {
    String fileName;
    BufferedReader in;
    PrintWriter out;
    public FileService(String fname){
        this.fileName = fname;
        try {
            out = new PrintWriter(new FileWriter(fileName, true));
            in = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}