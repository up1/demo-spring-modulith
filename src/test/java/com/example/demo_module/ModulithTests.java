package com.example.demo_module;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.model.ApplicationModules;

public class ModulithTests {
    @Test
    public void writeDocumentation() {
        var modules = ApplicationModules.of(DemoModuleApplication.class).verify();
        var opt = Documenter.DiagramOptions.defaults()
                .withStyle(Documenter.DiagramOptions.DiagramStyle.UML);
        new Documenter(modules)
                .writeModulesAsPlantUml(opt)
                .writeIndividualModulesAsPlantUml(opt);

    }
}
