package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.annotations.storage.Commons;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Entity class JInitializer {
    private List<Token> implementation = new List<>();

    public JInitializer() {
    }

    public JInitializer(List<Token> implementation) {
        this.implementation = implementation;
    }

    @Mandatory @Commons
    public List<Token> getImplementation() {
        return implementation;
    }

    public void setImplementation(List<Token> implementation) {
        this.implementation = implementation;
    }
}
