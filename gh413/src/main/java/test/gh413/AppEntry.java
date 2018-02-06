package test.gh413;

import act.Act;
import act.util.JsonView;
import org.osgl.mvc.annotation.GetAction;

@SuppressWarnings("unused")
@JsonView
public class AppEntry {

    @GetAction("test/str")
    public Object test(Foo<String> foo) {
        return foo;
    }

    @GetAction("test/int")
    public Object testInt(Foo<Integer> foo) {
        return foo.data * 2;
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
