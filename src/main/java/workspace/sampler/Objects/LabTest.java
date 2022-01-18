package workspace.sampler.Objects;

import workspace.sampler.Managers.TestType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LabTest extends SampledPerson {
    private String resultDate;
    private String birthDate;
    private String labCode;
    private String stickerNumber;
    private String resultTestCorona;
    private String variant;
    private TestType testType;
    private String joinDate;
    private String healthCareId;
    private String healthCareName;

    public LabTest(String idNum, String idType, String firstName, String lastName, String resultDate, String birthDate, String labCode, String stickerNumber, String resultTestCorona, String variant, TestType testType) {
        super(idNum, idType, firstName, lastName, resultTestCorona);
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getIdType() {
        return idType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getResultDate() {
        return resultDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public String getResultTestCorona() {
        return resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public TestType getTestType() {
        return testType;
    }

    public LocalDate getJoinDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        return LocalDate.parse(this.joinDate, formatter);
    }

    public String getHealthCareId() {
        return healthCareId;
    }

    public String getHealthCareName() {
        return healthCareName;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setHealthCareId(String healthCareId) {
        this.healthCareId = healthCareId;
    }

    public void setHealthCareName(String healthCareName) {
        this.healthCareName = healthCareName;
    }

    @Override
    public String toString() {
        return "LabTest{" +
                "idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", resultDate='" + resultDate + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", labCode='" + labCode + '\'' +
                ", stickerNumber='" + stickerNumber + '\'' +
                ", resultTestCorona='" + resultTestCorona + '\'' +
                ", variant='" + variant + '\'' +
                ", testType=" + testType +
                ", joinDate='" + joinDate + '\'' +
                ", healthCareId='" + healthCareId + '\'' +
                ", healthCareName='" + healthCareName + '\'' +
                '}';
    }
}
