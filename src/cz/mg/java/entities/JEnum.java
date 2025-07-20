package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.collections.list.List;
import cz.mg.java.entities.types.JTypeParameter;

public @Entity class JEnum extends JStructure {
    private List<JEnumEntry> entries;

    public JEnum() {
    }

    public JEnum(
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JTypeParameter> typeParameters,
        JStructure base,
        List<JInterface> interfaces,
        List<JVariable> variables,
        List<JMethod> methods,
        List<JEnumEntry> entries,
        String comment
    ) {
        super(
            annotations,
            modifiers,
            name,
            typeParameters,
            base,
            interfaces,
            variables,
            methods,
            comment
        );
        this.entries = entries;
    }

    @Required @Part
    public List<JEnumEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<JEnumEntry> entries) {
        this.entries = entries;
    }
}
