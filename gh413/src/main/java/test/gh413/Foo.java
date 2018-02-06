package test.gh413;

import act.data.annotation.Data;
import act.util.SimpleBean;

@Data
public class Foo<T> implements SimpleBean {
    public T data;
    public String s;
}
