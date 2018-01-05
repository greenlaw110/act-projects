package demo.gh417;

import act.Act;
import act.util.JsonView;
import org.osgl.mvc.annotation.GetAction;

@SuppressWarnings("unused")
public class AppEntry {

    @GetAction
    @JsonView
    public Record home() {
        return new Record();
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
