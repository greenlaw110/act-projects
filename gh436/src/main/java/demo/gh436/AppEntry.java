package demo.gh436;

import act.Act;
import org.osgl.mvc.annotation.GetAction;

@SuppressWarnings("unused")
public class AppEntry {

    @GetAction
    public void home() {
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
