package workspace.sampler.fileExtract;

import workspace.sampler.Objects.SampledPerson;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class CsvReader {

    public Set<SampledPerson> fileCsvReader(String fileName) {
        Set<SampledPerson> sampledPeople = new HashSet<SampledPerson>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
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
                record[4], record[5], record[6],record[7],record[8],toDate(record[9]), toDate(record[10]), toDate(record[11]));
    }

    public LocalDate toDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }
}
