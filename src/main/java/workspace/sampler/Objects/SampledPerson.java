package workspace.sampler.Objects;

import workspace.sampler.Managers.TestType;

public class SampledPerson{
    protected String idNum;
    protected String idType;
    protected String firstName;
    protected String lastName;

    private String mdaCode;
    private String city;
    private String street;
    private String buildingNumber;
    private String barcode;
    private String getDate;
    private String takeDate;
    private String resultDate;

    private String resultTestCorona;
    private String birthDate;
    private String labCode;
    private String stickerNumber;
    private String variant;
    private TestType testType;

    public SampledPerson(String idNum, String idType, String firstName, String lastName, String resultTestCorona) {
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultTestCorona = resultTestCorona;
    }

    public SampledPerson(String mdaCode, String idNum, String idType, String firstName, String lastName, String city, String street, String buildingNumber, String barcode, String getDate, String takeDate, String resultDate) {
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mdaCode = mdaCode;
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }

    public String getMdaCode() {
        return mdaCode;
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

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getGetDate() {
        return getDate;
    }

    public String getTakeDate() {
        return takeDate;
    }

    public String getResultDate() {
        return resultDate;
    }

    public String getResultTestCorona() {
        return resultTestCorona;
    }

    public void addLabTests(String birthDate, String labCode, String stickerNumber, String resultTestCorona, TestType testType, String variant) {
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona=resultTestCorona;
        this.testType = testType;
        this.variant=variant;
    }

    @Override
    public String toString() {
        return "SampledPerson{" +
                "mdaCode='" + mdaCode + '\'' +
                ", idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", barcode='" + barcode + '\'' +
                ", getDate=" + getDate +
                ", takeDate=" + takeDate +
                ", resultDate=" + resultDate +
                '}';
    }
}
