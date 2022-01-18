package workspace.sampler.fileTransformer;

import com.thoughtworks.xstream.XStream;
import workspace.sampler.Objects.LabTest;
import workspace.sampler.Objects.LabTestSet;

public class ObjectToXmlConverter {

    public XStream objectToXmlSerialization() {
        XStream xstream = new XStream();
        xstream.alias("labTest", LabTest.class);
        xstream.alias("labTests", LabTestSet.class);
        xstream.addImplicitCollection(LabTestSet.class, "labTestList");

        return xstream;
    }
}
