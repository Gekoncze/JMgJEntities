package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.collections.list.List;
import cz.mg.java.entities.types.JTypeParameter;

public @Entity class JClass extends JStructure {
    public JClass() {
    }

    public JClass(
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JTypeParameter> typeParameters,
        JStructure base,
        List<JInterface> interfaces,
        List<JVariable> variables,
        List<JMethod> methods,
        String comment
    ) {
        super(
            annotations,
            modifiers,
            name,
            typeParameters,
            base,
            interfaces,
            variables,
            methods,
            comment
        );
    }
}
