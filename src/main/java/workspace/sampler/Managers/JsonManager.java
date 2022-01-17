package workspace.sampler.Managers;

import workspace.sampler.fileExtract.CsvReader;
import workspace.sampler.fileLoader.JsonFileLoader;

public class JsonManager {

    public static void csvToJsonHandler() {
        CsvReader csvReader = new CsvReader();
        JsonFileLoader jsonFileLoader = new JsonFileLoader();

        jsonFileLoader.jsonToCsvSerialization(csvReader.fileCsvReader
                (new PropertiesFilesHandler().getMadaSamplerDataBase()));
    }
}
