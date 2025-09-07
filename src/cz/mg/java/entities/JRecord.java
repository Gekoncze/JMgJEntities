package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Links;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;

public @Entity class JRecord extends JStructure {
    private List<JBound> bounds = new List<>();
    private List<JVariable> properties = new List<>();
    private List<JType> interfaces = new List<>();
    private List<JType> permits = new List<>();
    private List<JVariable> fields = new List<>();
    private List<JInitializer> initializers = new List<>();
    private List<JConstructor> constructors = new List<>();
    private List<JMethod> methods = new List<>();
    private List<JStructure> structures = new List<>();

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
        List<JType> permits,
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
        this.bounds = bounds;
        this.properties = properties;
        this.interfaces = interfaces;
        this.permits = permits;
        this.fields = fields;
        this.initializers = initializers;
        this.constructors = constructors;
        this.methods = methods;
        this.structures = structures;
    }

    @Mandatory @Parts
    public List<JBound> getBounds() {
        return bounds;
    }

    public void setBounds(List<JBound> bounds) {
        this.bounds = bounds;
    }

    @Required @Parts
    public List<JVariable> getProperties() {
        return properties;
    }

    public void setProperties(List<JVariable> properties) {
        this.properties = properties;
    }

    @Required @Links
    public List<JType> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<JType> interfaces) {
        this.interfaces = interfaces;
    }

    @Required @Links
    public List<JType> getPermits() {
        return permits;
    }

    public void setPermits(List<JType> permits) {
        this.permits = permits;
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
