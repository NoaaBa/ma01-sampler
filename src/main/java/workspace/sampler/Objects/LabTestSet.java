package workspace.sampler.Objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LabTestSet {
    private Set<LabTest> labTestList;

    public LabTestSet(){
        this.labTestList = new HashSet<>();
    }

    public void add(LabTest test){
        this.labTestList.add(test);
    }

    public void clear() {
        this.labTestList.clear();
    }
}
