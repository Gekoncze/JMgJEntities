package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Shared;
import cz.mg.annotations.storage.Value;

public @Entity class JBound {
    private String name;
    private JSide side;
    private JType type;

    public JBound() {
    }

    public JBound(String name, JSide side, JType type) {
        this.name = name;
        this.side = side;
        this.type = type;
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
    public JType getType() {
        return type;
    }

    public void setType(JType type) {
        this.type = type;
    }
}
