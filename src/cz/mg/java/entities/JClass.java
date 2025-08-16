package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Common;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;

public @Entity class JClass extends JStructure {
    private JType base;
    private List<JConstructor> constructors = new List<>();

    public JClass() {
    }

    public JClass(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        JType base,
        List<JType> interfaces,
        List<JVariable> fields,
        List<JConstructor> constructors,
        List<JMethod> methods
    ) {
        super(
            comment,
            annotations,
            modifiers,
            name,
            interfaces,
            fields,
            methods
        );
        this.base = base;
        this.constructors = constructors;
    }

    @Optional @Common
    public JType getBase() {
        return base;
    }

    public void setBase(JType base) {
        this.base = base;
    }

    @Required @Parts
    public List<JConstructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<JConstructor> constructors) {
        this.constructors = constructors;
    }
}
