package workspace.sampler.fileExtract;

import workspace.sampler.Managers.PropertiesFilesHandler;
import workspace.sampler.Objects.LabTest;
import workspace.sampler.Objects.SampledPerson;
import workspace.sampler.fileLoader.JsonFileLoader;

import java.util.Set;

public class PositiveCovidPeopleParser<T> {

    public static void parsePositivePeople() {
        CsvReader csvReader = new CsvReader();
        JsonFileLoader jsonFileLoader = new JsonFileLoader();
        PropertiesFilesHandler propertiesFilesHandler = new PropertiesFilesHandler();
        Set<SampledPerson> sampledPeople = csvReader.fileCsvReader(propertiesFilesHandler.getMadaSamplerDataBase());
        Set<LabTest> labTests = csvReader.fileCsvReader(propertiesFilesHandler.getLabTestsDatabase());

        for (LabTest test : labTests) {
            for (SampledPerson person : sampledPeople) {
                if (test.getResultTestCorona().equals("1")) {
                    person.addLabTests(test.getBirthDate(), test.getLabCode(), test.getStickerNumber(), test.getResultTestCorona(), test.getTestType(), test.getVariant());
                }
            }

            jsonFileLoader.csvToJsonSerialization(sampledPeople, propertiesFilesHandler.getPositiveCoviePeopleSaveLocation());
        }
    }
}
