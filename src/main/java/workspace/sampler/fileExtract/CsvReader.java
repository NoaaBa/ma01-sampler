package workspace.sampler.fileExtract;

import workspace.sampler.Managers.PropertiesFilesHandler;
import workspace.sampler.Managers.TestType;
import workspace.sampler.Objects.LabTest;
import workspace.sampler.Objects.SampledPerson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CsvReader<T> {

    public CsvReader() {}

    public Set<T> fileCsvReader(String fileName) {

        Set<T> tSet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                if(fileName.equals(new PropertiesFilesHandler().getMadaSamplerDataBase())) {
                    SampledPerson sampledPerson = createSampledPerson(attributes);
                    tSet.add((T) sampledPerson);
                } else if (fileName.equals(new PropertiesFilesHandler().getLabTestsDatabase())) {
                    LabTest labTest = createLabTest(attributes);
                    tSet.add((T) labTest);
                }

                line = br.readLine();
            }
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error reading csv file.");
        }
        return tSet;
    }

    private SampledPerson createSampledPerson(String[] record) {
        return new SampledPerson(record[0], record[1], record[2], record[3],
                record[4], record[5], record[6],record[7],record[8],record[9], record[10], record[11]);
    }

    private LabTest createLabTest(String[] record) {
        TestType testType;
        if(record[10].equals(TestType.PCR.name())) {
            testType = TestType.PCR;
        } else {
            testType = TestType.RAPID;
        }
        return new LabTest(record[0], record[1], record[2], record[3],
                record[4], record[5], record[6],record[7],record[8], record[9], testType);
    }
}
