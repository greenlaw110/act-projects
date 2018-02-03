package test.gh487;

import act.Act;
import act.util.JsonView;
import org.osgl.mvc.annotation.GetAction;

@SuppressWarnings("unused")
public class AppEntry {

    @GetAction("/test")
    @JsonView
    public Object home(Area.Dao dao) {
        return dao.findAll();
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
