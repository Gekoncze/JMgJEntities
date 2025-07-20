package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.java.entities.types.JType;
import cz.mg.token.Token;

public @Entity class JMethod implements JEntity, JAnnotable, JModifiable, JCommentable {
    private List<JAnnotation> annotations = new List<>();
    private List<JModifier> modifiers = new List<>();
    private JType output;
    private String name;
    private List<JVariable> input = new List<>();
    private List<Token> implementation;
    private String comment;

    public JMethod() {
    }

    public JMethod(
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        JType output,
        String name,
        List<JVariable> input,
        List<Token> implementation,
        String comment
    ) {
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.output = output;
        this.name = name;
        this.input = input;
        this.implementation = implementation;
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

    @Override
    @Optional @Value
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }
}
