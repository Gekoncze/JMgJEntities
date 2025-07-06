package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;

public @Entity interface JModifiable {
    @Required @Value
    List<JModifier> getModifiers();
    void setModifiers(List<JModifier> modifiers);
}
