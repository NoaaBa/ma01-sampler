package workspace.sampler.fileLoader;

import com.thoughtworks.xstream.XStream;
import workspace.sampler.Managers.PropertiesFilesHandler;
import workspace.sampler.Objects.LabTest;
import workspace.sampler.Objects.LabTestSet;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class XmlFileLoader {

    final static int maxXmlInFile = 200;

    public static void loadFile(XStream xstream, Set<LabTest> labTests) {
        int counter = 0, fileNum = 0;

        LabTestSet labTestset = new LabTestSet();
        for (LabTest labTest : labTests) {
            labTestset.add(labTest);
            counter++;
            if (counter == maxXmlInFile) {
                try {
                    xstream.toXML(labTestset, new FileWriter(new PropertiesFilesHandler().getLabTestSaveLocation() + fileNum +".xml"));
                } catch (IOException e) {
                    System.out.println("Could not parse the data to xml.");
                }
                fileNum++;
                counter = 0;
                labTestset.clear();
            }
        }
    }
}
