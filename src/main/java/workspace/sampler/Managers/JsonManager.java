package workspace.sampler.Managers;

public class JsonManager extends FilesManager {

    public static void csvToJsonHandler() {
        FilesManager filesManager = new FilesManager();
        filesManager.getJsonFileLoader().jsonToCsvSerialization(filesManager.getCsvReader().fileCsvReader
                (new PropertiesFilesHandler().getMadaSamplerDataBase()));
    }
}
