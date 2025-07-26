package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.java.entities.interfaces.JAnnotable;
import cz.mg.java.entities.interfaces.JCommentable;
import cz.mg.java.entities.interfaces.JModifiable;
import cz.mg.token.Token;

public @Entity class JVariable implements JEntity, JAnnotable, JModifiable, JCommentable {
    private List<JAnnotation> annotations = new List<>();
    private List<JModifier> modifiers = new List<>();
    private JType type;
    private String name;
    private List<Token> expression;
    private String comment;

    public JVariable() {
    }

    public JVariable(
        List<JAnnotation> annotations,
        JType type,
        String name,
        List<Token> expression,
        String comment
    ) {
        this.annotations = annotations;
        this.type = type;
        this.name = name;
        this.expression = expression;
        this.comment = comment;
    }

    @Override
    @Required @Part
    public List<JAnnotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<JAnnotation> annotations) {
        this.annotations = annotations;
    }

    @Override
    @Required @Part
    public List<JModifier> getModifiers() {
        return modifiers;
    }

    @Override
    public void setModifiers(List<JModifier> modifiers) {
        this.modifiers = modifiers;
    }

    @Required @Shared
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

    @Optional @Shared
    public List<Token> getExpression() {
        return expression;
    }

    public void setExpression(List<Token> expression) {
        this.expression = expression;
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
