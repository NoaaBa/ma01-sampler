package workspace.sampler;


import workspace.sampler.Objects.SampledPerson;
import workspace.sampler.fileExtract.CsvReader;
import workspace.sampler.fileLoader.JsonFileLoader;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/main/resources/MadaReports.csv";
        CsvReader csvReader = new CsvReader();
        JsonFileLoader jsonFileLoader = new JsonFileLoader();

        Set<SampledPerson> sampledPersonSet = csvReader.fileCsvReader(fileName);
        jsonFileLoader.jsonToCsvSerialization(sampledPersonSet);
        //jsonCsvSerializer.jsonToCsvSerialization(sampledPersonSet);
        /*for (SampledPerson person:sampledPersonSet) {
            System.out.println(person);
        }*/
    }
}
