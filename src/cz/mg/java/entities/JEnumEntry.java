package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Commons;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Entity class JEnumEntry implements JEntity {
    private String name;
    private List<Token> expression;

    public JEnumEntry() {
    }

    public JEnumEntry(String name, List<Token> expression) {
        this.name = name;
        this.expression = expression;
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
