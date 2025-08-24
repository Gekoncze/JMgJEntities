package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Parts;
import cz.mg.collections.list.List;

public @Entity class JAnnotype extends JStructure {
    private List<JVariable> elements = new List<>();

    public JAnnotype() {
    }

    public JAnnotype(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name,
        List<JVariable> elements
    ) {
        super(
            comment,
            annotations,
            modifiers,
            name
        );
        this.elements = elements;
    }

    @Required @Parts
    public List<JVariable> getElements() {
        return elements;
    }

    public void setElements(List<JVariable> elements) {
        this.elements = elements;
    }
}
