package workspace.sampler.Managers;

import workspace.sampler.Objects.LabTest;
import workspace.sampler.fileLoader.XmlFileLoader;

import java.util.Set;

public class XmlManager extends FilesManager {

    public static void csvToXmlHandler() {
        FilesManager filesManager = new FilesManager();

        // Turn the data in the csv file to set of objects.
        Set<LabTest> labTestSet =  filesManager.getCsvReader().fileCsvReader(new PropertiesFilesHandler().getLabTestsDatabase());

        // Add the medical information to each test in the set.
        filesManager.getCsvColAddition().DataFetchingMedicalProvider(labTestSet);

        // Load the object that was saved from the csv file into xml files.
        XmlFileLoader.loadFile(filesManager.getObjectToXmlConverter().objectToXmlSerialization(), labTestSet);
    }
}
