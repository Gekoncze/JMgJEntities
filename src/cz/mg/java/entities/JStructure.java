package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.*;
import cz.mg.collections.list.List;
import cz.mg.java.entities.interfaces.JAnnotable;
import cz.mg.java.entities.interfaces.JCommentable;
import cz.mg.java.entities.interfaces.JModifiable;

public abstract @Entity class JStructure implements JEntity, JAnnotable, JModifiable, JCommentable {
    private String comment;
    private List<JAnnotation> annotations = new List<>();
    private List<JModifier> modifiers = new List<>();
    private List<String> customModifiers = new List<>();
    private String name;
    private List<JType> interfaces = new List<>();
    private List<JVariable> fields = new List<>();
    private List<JMethod> methods = new List<>();

    public JStructure() {
    }

    public JStructure(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        List<String> customModifiers,
        String name,
        List<JType> interfaces,
        List<JVariable> fields,
        List<JMethod> methods
    ) {
        this.comment = comment;
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.customModifiers = customModifiers;
        this.name = name;
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

    @Required @Values
    public List<String> getCustomModifiers() {
        return customModifiers;
    }

    public void setCustomModifiers(List<String> customModifiers) {
        this.customModifiers = customModifiers;
    }

    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
