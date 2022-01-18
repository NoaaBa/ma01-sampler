package workspace.sampler.fileLoader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class JsonFileLoader<T> {

    final static int maxJsonInFile = 200;

    public void csvToJsonSerialization(Set<T> tSet, String filePath) {
        Set<T> smallerJsonSet = new HashSet<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        int counter = 0, fileNum = 0;
        try {
            for (T person : tSet) {
                smallerJsonSet.add(person);
                counter++;
                if (counter == maxJsonInFile) {
                    gson.toJson(smallerJsonSet, new FileWriter(filePath + fileNum + ".json"));
                    fileNum++;
                    smallerJsonSet.clear();
                    counter = 0;
                }
            }
        } catch (IOException e) {
            System.out.println("Error processing CSV to json. " + this.getClass().getName());
        }
    }
}