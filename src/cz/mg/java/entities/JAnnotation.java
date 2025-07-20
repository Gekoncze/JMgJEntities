package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Entity class JAnnotation implements JEntity, JNamed, JCommentable {
    private String name;
    private List<Token> expression;
    private String comment;

    public JAnnotation() {
    }

    public JAnnotation(String name, List<Token> expression, String comment) {
        this.name = name;
        this.expression = expression;
        this.comment = comment;
    }

    @Override
    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Optional @Part
    public List<Token> getExpression() {
        return expression;
    }

    public void setExpression(List<Token> expression) {
        this.expression = expression;
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
