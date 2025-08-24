package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Commons;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.java.entities.bounds.JBound;

public @Entity class JType implements JEntity {
    private String name;
    private List<JBound> bounds;
    private JArrayType arrayType;

    public JType() {
    }

    public JType(String name) {
        this.name = name;
    }

    public JType(String name, List<JBound> bounds) {
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

    @Optional @Commons
    public List<JBound> getBounds() {
        return bounds;
    }

    public void setBounds(List<JBound> bounds) {
        this.bounds = bounds;
    }

    @Optional @Value
    public JArrayType getArrayType() {
        return arrayType;
    }

    public void setArrayType(JArrayType arrayType) {
        this.arrayType = arrayType;
    }
}
