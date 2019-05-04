package test;

import org.apache.cayenne.di.Binder;
import org.apache.cayenne.di.Module;
import org.apache.cayenne.gen.CgenModule;
import org.apache.cayenne.gen.property.NumericPropertyDescriptorCreator;

public class CustomModule implements Module {
    public void configure(Binder binder) {
        CgenModule.contributeUserProperties(binder)
                .insertBefore(TestPropertyDescriptorCreator.class, NumericPropertyDescriptorCreator.class);
    }
}
