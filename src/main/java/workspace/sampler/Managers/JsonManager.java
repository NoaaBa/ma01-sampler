package workspace.sampler.Managers;

public class JsonManager extends FilesManager {

    public static void csvToJsonHandler() {
        FilesManager filesManager = new FilesManager();
        PropertiesFilesHandler propertiesFilesHandler = new PropertiesFilesHandler();
        filesManager.getJsonFileLoader().csvToJsonSerialization(filesManager.getCsvReader().fileCsvReader
                        (propertiesFilesHandler.getMadaSamplerDataBase()), propertiesFilesHandler.getMadaSamplerSaveLocation());
    }
}
