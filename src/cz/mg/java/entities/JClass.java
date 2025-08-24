package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Common;
import cz.mg.annotations.storage.Links;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;

public @Entity class JClass extends JStructure {
    private List<JBound> bounds = new List<>();
    private JType base;
    private List<JType> interfaces = new List<>();
    private List<JVariable> fields = new List<>();
    private List<JInitializer> initializers = new List<>();
    private List<JConstructor> constructors = new List<>();
    private List<JMethod> methods = new List<>();

    public JClass() {
    }

    public JClass(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JBound> bounds,
        JType base,
        List<JType> interfaces,
        List<JVariable> fields,
        List<JInitializer> initializers,
        List<JConstructor> constructors,
        List<JMethod> methods
    ) {
        super(
            comment,
            annotations,
            modifiers,
            name
        );
        this.bounds = bounds;
        this.base = base;
        this.interfaces = interfaces;
        this.fields = fields;
        this.initializers = initializers;
        this.constructors = constructors;
        this.methods = methods;
    }

    @Mandatory @Parts
    public List<JBound> getBounds() {
        return bounds;
    }

    public void setBounds(List<JBound> bounds) {
        this.bounds = bounds;
    }

    @Optional @Common
    public JType getBase() {
        return base;
    }

    public void setBase(JType base) {
        this.base = base;
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
}
