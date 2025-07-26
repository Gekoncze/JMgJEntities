package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Shared;
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

    @Optional @Shared
    public JType getBase() {
        return base;
    }

    public void setBase(JType base) {
        this.base = base;
    }

    @Required @Part
    public List<JConstructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<JConstructor> constructors) {
        this.constructors = constructors;
    }
}
