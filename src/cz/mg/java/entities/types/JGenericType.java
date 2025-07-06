package cz.mg.java.entities.types;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Value;

import java.util.List;

public @Entity class JGenericType implements JType {
    private String name;
    private List<JType> typeArguments;

    public JGenericType() {
    }

    public JGenericType(String name, List<JType> typeArguments) {
        this.name = name;
        this.typeArguments = typeArguments;
    }

    @Required @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Required @Part
    public List<JType> getTypeArguments() {
        return typeArguments;
    }

    public void setTypeArguments(List<JType> typeArguments) {
        this.typeArguments = typeArguments;
    }
}
