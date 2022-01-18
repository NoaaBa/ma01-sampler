package workspace.sampler.Managers;

import workspace.sampler.fileLoader.XmlFileLoader;

public class XmlManager extends FilesManager {

    public static void csvToXmlHandler() {
        FilesManager filesManager = new FilesManager();
        XmlFileLoader.loadFile(filesManager.getObjectToXmlConverter().objectToXmlSerialization(),
                filesManager.getCsvReader().fileCsvReader(new PropertiesFilesHandler().getLabTestsDatabase()));
    }
}
