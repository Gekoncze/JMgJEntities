package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Links;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;

public @Entity class JInterface extends JStructure {
    private List<JBound> bounds = new List<>();
    private List<JType> interfaces = new List<>();
    private List<JVariable> fields = new List<>();
    private List<JMethod> methods = new List<>();
    private List<JStructure> structures = new List<>();

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
        this.interfaces = interfaces;
        this.fields = fields;
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

    @Required @Links
    public List<JType> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<JType> interfaces) {
        this.interfaces = interfaces;
    }

    @Required @Parts
    public List<JVariable> getFields() {
        return fields;
    }

    public void setFields(List<JVariable> fields) {
        this.fields = fields;
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
