package utilities;

import com.google.gson.Gson;
import model.AvalaraJsonParser;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public String isFileNameHybrid(String fileName){

        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(fileName);
        boolean b = m.matches();
        boolean found = m.find();
        if (found)
            return "File Name Is Hybrid";
        else
            return "File Name Is Not Hybrid";
    }
}