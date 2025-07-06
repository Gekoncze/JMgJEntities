package cz.mg.java.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Value;

public @Entity class JBaseType implements JType {
    private String name;

    public JBaseType() {
    }

    public JBaseType(String name) {
        this.name = name;
    }

    @Required @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
