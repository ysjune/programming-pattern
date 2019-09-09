package good_old_times;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GoodOldTimes {

    private static List<Object> data = new ArrayList<>();
    private static String[] lineSep = new String[1024];

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("stop_words.txt")))){
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                line += line;
            }
            lineSep = line.split(",");
            data.add(lineSep);
        } catch (IOException e) {

        }

        String[] data1 = new String[80];

        data.add(data1); // data[1]
        data.add(null); // data[2]
        data.add(0);  // data[3]
        data.add(false); // data[4]
        data.add(""); // data[5]
        data.add(""); // data[6]
        data.add(0); // data[7]






    }


}
