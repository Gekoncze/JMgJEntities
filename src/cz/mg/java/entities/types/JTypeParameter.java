package cz.mg.java.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;

public @Entity class JTypeParameter implements JType {
    private String name;
    private List<JType> bounds;

    public JTypeParameter() {
    }

    public JTypeParameter(String name, List<JType> bounds) {
        this.name = name;
        this.bounds = bounds;
    }

    @Required @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Required @Shared
    public List<JType> getBounds() {
        return bounds;
    }

    public void setBounds(List<JType> bounds) {
        this.bounds = bounds;
    }
}
