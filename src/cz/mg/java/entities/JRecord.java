package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;

public @Entity class JRecord extends JStructure {
    private List<JVariable> properties = new List<>();
    private List<JConstructor> constructors = new List<>();

    public JRecord() {
    }

    public JRecord(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JBound> bounds,
        List<JVariable> properties,
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
            bounds,
            interfaces,
            fields,
            methods
        );
        this.properties = properties;
        this.constructors = constructors;
    }

    @Required @Parts
    public List<JVariable> getProperties() {
        return properties;
    }

    public void setProperties(List<JVariable> properties) {
        this.properties = properties;
    }

    @Required @Parts
    public List<JConstructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<JConstructor> constructors) {
        this.constructors = constructors;
    }
}
