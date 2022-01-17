package workspace.sampler.fileExtract;

import workspace.sampler.Objects.SampledPerson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.HashSet;
import java.util.Set;

public class CsvReader {

    public CsvReader() {}

    public Set<SampledPerson> fileCsvReader(String fileName) {
        Set<SampledPerson> sampledPeople = new HashSet<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(",");
                SampledPerson sampledPerson = createPerson(attributes);
                sampledPeople.add(sampledPerson);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading csv file.");
        }
        return sampledPeople;
    }

    private SampledPerson createPerson(String[] record) {
        return new SampledPerson(record[0], record[1], record[2], record[3],
                record[4], record[5], record[6],record[7],record[8],record[9], record[10], record[11]);
    }
}
