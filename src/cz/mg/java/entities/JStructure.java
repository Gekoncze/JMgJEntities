package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Link;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.java.entities.types.JTypeParameter;

public abstract @Entity class JStructure implements JEntity, JNamed, JAnnotable, JModifiable, JCommentable {
    private List<JAnnotation> annotations = new List<>();
    private List<JModifier> modifiers = new List<>();
    private String name;
    private List<JTypeParameter> typeParameters = new List<>();
    private JStructure base;
    private List<JInterface> interfaces = new List<>();
    private List<JVariable> variables = new List<>();
    private List<JMethod> methods = new List<>();
    private String comment;

    public JStructure() {
    }

    public JStructure(
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JTypeParameter> typeParameters,
        JStructure base,
        List<JInterface> interfaces,
        List<JVariable> variables,
        List<JMethod> methods,
        String comment
    ) {
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.name = name;
        this.typeParameters = typeParameters;
        this.base = base;
        this.interfaces = interfaces;
        this.variables = variables;
        this.methods = methods;
        this.comment = comment;
    }

    @Override
    @Required @Part
    public List<JAnnotation> getAnnotations() {
        return annotations;
    }

    @Override
    public void setAnnotations(List<JAnnotation> annotations) {
        this.annotations = annotations;
    }

    @Override
    @Required @Value
    public List<JModifier> getModifiers() {
        return modifiers;
    }

    @Override
    public void setModifiers(List<JModifier> modifiers) {
        this.modifiers = modifiers;
    }

    @Override
    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Required @Part
    public List<JTypeParameter> getTypeParameters() {
        return typeParameters;
    }

    public void setTypeParameters(List<JTypeParameter> typeParameters) {
        this.typeParameters = typeParameters;
    }

    @Optional @Link
    public JStructure getBase() {
        return base;
    }

    public void setBase(JStructure base) {
        this.base = base;
    }

    @Required @Link
    public List<JInterface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<JInterface> interfaces) {
        this.interfaces = interfaces;
    }

    @Required @Part
    public List<JVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<JVariable> variables) {
        this.variables = variables;
    }

    @Required @Part
    public List<JMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<JMethod> methods) {
        this.methods = methods;
    }

    @Override
    public @Required String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }
}
