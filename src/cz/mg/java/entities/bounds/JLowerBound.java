package cz.mg.java.entities.bounds;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.java.entities.JType;

public @Entity class JLowerBound implements JBound {
    private JType type;

    public JLowerBound() {
    }

    public JLowerBound(JType type) {
        this.type = type;
    }

    @Required @Shared
    public JType getType() {
        return type;
    }

    public void setType(JType type) {
        this.type = type;
    }
}
