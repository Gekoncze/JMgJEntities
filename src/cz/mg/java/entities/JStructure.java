package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.*;
import cz.mg.collections.list.List;
import cz.mg.java.entities.interfaces.JAnnotable;
import cz.mg.java.entities.interfaces.JCommentable;
import cz.mg.java.entities.interfaces.JModifiable;

public abstract @Entity class JStructure implements JEntity, JAnnotable, JModifiable, JCommentable {
    private String comment;
    private List<JAnnotation> annotations = new List<>();
    private List<JModifier> modifiers = new List<>();
    private String name;

    public JStructure() {
    }

    public JStructure(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        String name
    ) {
        this.comment = comment;
        this.annotations = annotations;
        this.modifiers = modifiers;
        this.name = name;
    }

    @Override
    @Optional @Value
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    @Required @Parts
    public List<JAnnotation> getAnnotations() {
        return annotations;
    }

    @Override
    public void setAnnotations(List<JAnnotation> annotations) {
        this.annotations = annotations;
    }

    @Override
    @Required @Values
    public List<JModifier> getModifiers() {
        return modifiers;
    }

    @Override
    public void setModifiers(List<JModifier> modifiers) {
        this.modifiers = modifiers;
    }

    @Optional @Value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
