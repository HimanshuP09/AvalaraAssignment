package utilities;

import com.google.gson.Gson;
import model.AvalaraJsonParser;

import java.io.*;

public class FileHandlingUtility {

    private Gson gson;
    public AvalaraJsonParser getAvalaraJson(String path) {

        try {
            gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader(path));
            return gson.fromJson(br, AvalaraJsonParser.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void saveAvalaraJson(AvalaraJsonParser avalaraJsonParser, String path){

            try {
                gson = new Gson();
                String jsonString = gson.toJson(avalaraJsonParser);
                FileWriter writer = new FileWriter(path);
                writer.write(jsonString);
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}