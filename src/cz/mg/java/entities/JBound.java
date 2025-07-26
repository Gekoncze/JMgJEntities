package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;

public @Entity class JBound {
    private String name;
    private JSide side;
    private List<JType> types;

    public JBound() {
    }

    public JBound(String name, JSide side, List<JType> types) {
        this.name = name;
        this.side = side;
        this.types = types;
    }

    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Optional @Value
    public JSide getSide() {
        return side;
    }

    public void setSide(JSide side) {
        this.side = side;
    }

    @Optional @Shared
    public List<JType> getTypes() {
        return types;
    }

    public void setTypes(List<JType> types) {
        this.types = types;
    }
}
