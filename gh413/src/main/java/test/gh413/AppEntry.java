package test.gh413;

import act.Act;
import act.util.JsonView;
import org.osgl.mvc.annotation.GetAction;

@SuppressWarnings("unused")
public class AppEntry {

    @GetAction("test")
    @JsonView
    public Object test(Foo<String> foo) {
        return foo;
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
