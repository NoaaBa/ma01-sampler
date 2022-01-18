package workspace.sampler;

import workspace.sampler.Managers.JsonManager;
import workspace.sampler.Managers.XmlManager;
import workspace.sampler.fileExtract.PositiveCovidPeopleParser;

public class Main {

    public static void main(String[] args) {
        JsonManager.csvToJsonHandler();
        XmlManager.csvToXmlHandler();
        PositiveCovidPeopleParser.parsePositivePeople();
    }
}
