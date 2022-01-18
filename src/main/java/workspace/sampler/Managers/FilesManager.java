package workspace.sampler.Managers;

import workspace.sampler.fileTransformer.MedicalLabTestFetch;
import workspace.sampler.fileExtract.CsvReader;
import workspace.sampler.fileLoader.JsonFileLoader;
import workspace.sampler.fileTransformer.ObjectToXmlConverter;

public class FilesManager {

    public FilesManager() {}

    protected CsvReader getCsvReader() {
        return new CsvReader();
    }

    protected JsonFileLoader getJsonFileLoader() {
        return new JsonFileLoader();
    }

    protected ObjectToXmlConverter getObjectToXmlConverter() {
        return new ObjectToXmlConverter();
    }

    protected MedicalLabTestFetch getCsvColAddition() {return new MedicalLabTestFetch();}
}
