package test;

import java.util.Optional;

import org.apache.cayenne.gen.PropertyDescriptor;
import org.apache.cayenne.gen.property.PropertyDescriptorCreator;

public class TestPropertyDescriptorCreator implements PropertyDescriptorCreator {
    @Override
    public Optional<PropertyDescriptor> apply(Class<?> aClass) {
        if(CharSequence.class.isAssignableFrom(aClass)) {
            return Optional.of(new PropertyDescriptor(TestProperty.class.getName(), "new TestProperty"));
        }
        return Optional.empty();
    }
}
