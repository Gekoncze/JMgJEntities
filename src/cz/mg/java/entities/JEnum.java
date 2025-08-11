package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;

public @Entity class JEnum extends JStructure {
    private List<JEnumEntry> entries = new List<>();
    private List<JConstructor> constructors = new List<>();

    public JEnum() {
    }

    public JEnum(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        List<String> customModifiers,
        String name,
        List<JType> interfaces,
        List<JEnumEntry> entries,
        List<JVariable> fields,
        List<JConstructor> constructors,
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
        this.entries = entries;
        this.constructors = constructors;
    }

    @Required @Parts
    public List<JEnumEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<JEnumEntry> entries) {
        this.entries = entries;
    }

    @Required @Parts
    public List<JConstructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<JConstructor> constructors) {
        this.constructors = constructors;
    }
}
