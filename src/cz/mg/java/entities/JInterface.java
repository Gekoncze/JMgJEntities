package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;

public @Entity class JInterface extends JStructure {
    public JInterface() {
    }

    public JInterface(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JBound> bounds,
        List<JType> interfaces,
        List<JVariable> fields,
        List<JMethod> methods
    ) {
        super(
            comment,
            annotations,
            modifiers,
            name,
            bounds,
            interfaces,
            fields,
            methods
        );
    }
}
