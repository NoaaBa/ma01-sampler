package workspace.sampler.fileLoader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import workspace.sampler.Objects.PropertiesFilesHandler;
import workspace.sampler.Objects.SampledPerson;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class JsonFileLoader {

    final static int maxJsonInFile = 200;

    public void jsonToCsvSerialization(Set<SampledPerson> sampledPersonSet) {
        Set<SampledPerson> smallerJsonSet = new HashSet<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        PropertiesFilesHandler propertiesFilesHandler = new PropertiesFilesHandler();

        int counter = 0, fileNum = 0;
        try {
            for (SampledPerson person : sampledPersonSet) {
                smallerJsonSet.add(person);
                counter++;
                if (counter == maxJsonInFile) {
                    gson.toJson(smallerJsonSet, new FileWriter(propertiesFilesHandler.getMadaSamplerSaveLocation() + fileNum + ".json"));
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