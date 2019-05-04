package test;

import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.exp.property.BaseProperty;

public class TestProperty extends BaseProperty<String> {

    public TestProperty(String name, Class<? super String> type) {
        super(name, null, type);
    }

    protected TestProperty(String name, Expression expression, Class<? super String> type) {
        super(name, expression, type);
    }
}
