package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.collections.list.List;

public @Entity class JInterface extends JStructure {
    public JInterface() {
    }

    public JInterface(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        List<String> customModifiers,
        String name,
        List<JType> interfaces,
        List<JVariable> fields,
        List<JMethod> methods
    ) {
        super(
            comment,
            annotations,
            modifiers,
            customModifiers,
            name,
            interfaces,
            fields,
            methods
        );
    }
}
