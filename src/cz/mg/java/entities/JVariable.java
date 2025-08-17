package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.*;
import cz.mg.collections.list.List;
import cz.mg.java.entities.interfaces.JAnnotable;
import cz.mg.java.entities.interfaces.JModifiable;
import cz.mg.token.Token;

public @Entity class JVariable implements JEntity, JAnnotable, JModifiable {
    private List<JAnnotation> annotations = new List<>();
    private List<JModifier> modifiers = new List<>();
    private JType type;
    private String name;
    private List<Token> expression;

    public JVariable() {
    }

    public JVariable(
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        JType type,
        String name
    ) {
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.type = type;
        this.name = name;
    }

    public JVariable(
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        JType type,
        String name,
        List<Token> expression
    ) {
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.type = type;
        this.name = name;
        this.expression = expression;
    }

    @Override
    @Required @Parts
    public List<JAnnotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<JAnnotation> annotations) {
        this.annotations = annotations;
    }

    @Override
    @Required @Parts
    public List<JModifier> getModifiers() {
        return modifiers;
    }

    @Override
    public void setModifiers(List<JModifier> modifiers) {
        this.modifiers = modifiers;
    }

    @Required @Common
    public JType getType() {
        return type;
    }

    public void setType(JType type) {
        this.type = type;
    }

    @Required @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Optional @Commons
    public List<Token> getExpression() {
        return expression;
    }

    public void setExpression(List<Token> expression) {
        this.expression = expression;
    }
}
