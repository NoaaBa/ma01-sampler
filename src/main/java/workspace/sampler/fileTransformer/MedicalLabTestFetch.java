package workspace.sampler.fileTransformer;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.HealthCareProvider;
import health_care_provider.models.PersonInsured;
import workspace.sampler.Objects.LabTest;

import java.io.IOException;
import java.util.Set;

public class MedicalLabTestFetch {

    public void DataFetchingMedicalProvider(Set<LabTest> labTests) {
        for (LabTest labTest:labTests) {
            try {
                int idType = Integer.parseInt(labTest.getIdType());
                int idNum = Integer.parseInt(labTest.getIdNum());
                PersonInsured personInsured = new HealthCareInfoProvider().fetchInfo(idNum, idType);

                labTest.setJoinDate(String.valueOf(personInsured.getJoinDate()));
                labTest.setHealthCareId(String.valueOf(personInsured.getHealthCareId()));
                labTest.setHealthCareName(personInsured.getHealthCareName());

            } catch (InvalidIdException e) {
                System.out.println("Invalid id. Person info:\n" + labTest);
            } catch(NumberFormatException ignored) {}
        }
    }
}
