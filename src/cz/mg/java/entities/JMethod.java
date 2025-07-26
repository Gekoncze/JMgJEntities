package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;
import cz.mg.java.entities.interfaces.JAnnotable;
import cz.mg.java.entities.interfaces.JCommentable;
import cz.mg.java.entities.interfaces.JModifiable;
import cz.mg.token.Token;

public @Entity class JMethod implements JEntity, JAnnotable, JModifiable, JCommentable {
    private String comment;
    private List<JAnnotation> annotations = new List<>();
    private List<JModifier> modifiers = new List<>();
    private List<JBound> bounds = new List<>();
    private JType output;
    private String name;
    private List<JVariable> input = new List<>();
    private List<Token> implementation;

    public JMethod() {
    }

    public JMethod(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        List<JBound> bounds,
        JType output,
        String name,
        List<JVariable> input,
        List<Token> implementation
    ) {
        this.comment = comment;
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.bounds = bounds;
        this.output = output;
        this.name = name;
        this.input = input;
        this.implementation = implementation;
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

    @Required @Shared
    public List<JBound> getBounds() {
        return bounds;
    }

    public void setBounds(List<JBound> bounds) {
        this.bounds = bounds;
    }

    @Optional @Shared
    public JType getOutput() {
        return output;
    }

    public void setOutput(JType output) {
        this.output = output;
    }

    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Required @Part
    public List<JVariable> getInput() {
        return input;
    }

    public void setInput(List<JVariable> input) {
        this.input = input;
    }

    @Optional @Shared
    public List<Token> getImplementation() {
        return implementation;
    }

    public void setImplementation(List<Token> implementation) {
        this.implementation = implementation;
    }
}
