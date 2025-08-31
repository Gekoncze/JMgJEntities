package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Links;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;

public @Entity class JEnum extends JStructure {
    private List<JType> interfaces = new List<>();
    private List<JEnumEntry> entries = new List<>();
    private List<JVariable> fields = new List<>();
    private List<JInitializer> initializers = new List<>();
    private List<JConstructor> constructors = new List<>();
    private List<JMethod> methods = new List<>();
    private List<JStructure> structures = new List<>();

    public JEnum() {
    }

    public JEnum(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JType> interfaces,
        List<JEnumEntry> entries,
        List<JVariable> fields,
        List<JInitializer> initializers,
        List<JConstructor> constructors,
        List<JMethod> methods,
        List<JStructure> structures
    ) {
        super(
            comment,
            annotations,
            modifiers,
            name
        );
        this.interfaces = interfaces;
        this.entries = entries;
        this.fields = fields;
        this.initializers = initializers;
        this.constructors = constructors;
        this.methods = methods;
        this.structures = structures;
    }

    @Required @Links
    public List<JType> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<JType> interfaces) {
        this.interfaces = interfaces;
    }

    @Required @Parts
    public List<JEnumEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<JEnumEntry> entries) {
        this.entries = entries;
    }

    @Required @Parts
    public List<JVariable> getFields() {
        return fields;
    }

    public void setFields(List<JVariable> fields) {
        this.fields = fields;
    }

    @Required @Parts
    public List<JInitializer> getInitializers() {
        return initializers;
    }

    public void setInitializers(List<JInitializer> initializers) {
        this.initializers = initializers;
    }

    @Required @Parts
    public List<JConstructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<JConstructor> constructors) {
        this.constructors = constructors;
    }

    @Required @Parts
    public List<JMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<JMethod> methods) {
        this.methods = methods;
    }

    @Required @Parts
    public List<JStructure> getStructures() {
        return structures;
    }

    public void setStructures(List<JStructure> structures) {
        this.structures = structures;
    }
}
