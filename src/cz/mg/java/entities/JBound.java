package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;

public @Entity class JBound {
    private String name;
    private JType type;

    public JBound() {
    }

    public JBound(String name, JType type) {
        this.name = name;
        this.type = type;
    }

    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Optional @Shared
    public JType getType() {
        return type;
    }

    public void setType(JType type) {
        this.type = type;
    }
}
