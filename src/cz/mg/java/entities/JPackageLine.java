package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Value;
import cz.mg.annotations.storage.Values;
import cz.mg.collections.list.List;
import cz.mg.java.entities.interfaces.JCommentable;

public @Entity class JPackageLine implements JEntity, JCommentable {
    private List<String> path = new List<>();
    private String comment;

    public JPackageLine() {
    }

    public JPackageLine(List<String> path, String comment) {
        this.path = path;
        this.comment = comment;
    }

    @Required @Values
    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
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
}
