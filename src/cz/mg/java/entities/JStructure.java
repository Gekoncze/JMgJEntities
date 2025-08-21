package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.*;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;
import cz.mg.java.entities.interfaces.JAnnotable;
import cz.mg.java.entities.interfaces.JCommentable;
import cz.mg.java.entities.interfaces.JModifiable;

public abstract @Entity class JStructure implements JEntity, JAnnotable, JModifiable, JCommentable {
    private String comment;
    private List<JAnnotation> annotations = new List<>();
    private List<JModifier> modifiers = new List<>();
    private String name;
    private List<JBound> bounds = new List<>();
    private List<JType> interfaces = new List<>();
    private List<JVariable> fields = new List<>();
    private List<JMethod> methods = new List<>();

    public JStructure() {
    }

    public JStructure(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JBound> bounds,
        List<JType> interfaces,
        List<JVariable> fields,
        List<JMethod> methods
    ) {
        this.comment = comment;
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.name = name;
        this.bounds = bounds;
        this.interfaces = interfaces;
        this.fields = fields;
        this.methods = methods;
    }

    @Override
    @Optional @Value
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    @Required @Parts
    public List<JAnnotation> getAnnotations() {
        return annotations;
    }

    @Override
    public void setAnnotations(List<JAnnotation> annotations) {
        this.annotations = annotations;
    }

    @Override
    @Required @Values
    public List<JModifier> getModifiers() {
        return modifiers;
    }

    @Override
    public void setModifiers(List<JModifier> modifiers) {
        this.modifiers = modifiers;
    }

    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
