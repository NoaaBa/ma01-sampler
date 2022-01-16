package workspace.sampler.Objects;

import java.time.LocalDate;

public class SampledPerson {
    String mdaCode;
    String idNum;
    String idType;
    String firstName;
    String lastName;
    String city;
    String street;
    String buildingNumber;
    String barcode;
    LocalDate getDate;
    LocalDate takeDate;
    LocalDate resultDate;

    public SampledPerson(String mdaCode, String idNum, String idType, String firstName, String lastName, String city, String street, String buildingNumber, String barcode, LocalDate getDate, LocalDate takeDate, LocalDate resultDate) {
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

    public LocalDate getGetDate() {
        return getDate;
    }

    public LocalDate getTakeDate() {
        return takeDate;
    }

    public LocalDate getResultDate() {
        return resultDate;
    }
}
