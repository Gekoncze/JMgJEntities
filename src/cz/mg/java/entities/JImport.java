package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;

public @Entity class JImport implements JEntity {
    private List<String> path = new List<>();

    public JImport() {
    }

    public JImport(List<String> path) {
        this.path = path;
    }

    @Required @Value
    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }
}
