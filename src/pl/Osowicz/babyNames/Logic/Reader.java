package pl.Osowicz.babyNames.Logic;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    String fileName = "Popular_Baby_Names.csv";
    File file = new File(fileName);
    ArrayList<String> lineList = new ArrayList<>();

    public ArrayList<String> fileReader() {

        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            bufferedReader.readLine(); // to ignore header
            while ((line = bufferedReader.readLine()) != null ){
                lineList.add(line);
            }
        } catch  (IOException e) {
            e.printStackTrace();
        }
        return lineList;
    }
}