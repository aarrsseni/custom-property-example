package test;

import java.util.Collection;
import java.util.Collections;

import org.apache.cayenne.di.Module;
import org.apache.cayenne.tools.CayenneToolsModuleProvider;

public class CustomModuleServerProvider implements CayenneToolsModuleProvider {
    public Module module() {
        return new CustomModule();
    }

    public Class<? extends Module> moduleType() {
        return CustomModule.class;
    }

    public Collection<Class<? extends Module>> overrides() {
        return Collections.emptyList();
    }
}
