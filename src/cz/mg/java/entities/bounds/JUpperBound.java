package cz.mg.java.entities.bounds;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;
import cz.mg.java.entities.JType;

public @Entity class JUpperBound implements JBound {
    private String name;
    private List<JType> types = new List<>();

    public JUpperBound() {
    }

    public JUpperBound(String name, List<JType> types) {
        this.name = name;
        this.types = types;
    }

    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Required @Shared
    public List<JType> getTypes() {
        return types;
    }

    public void setTypes(List<JType> types) {
        this.types = types;
    }
}
