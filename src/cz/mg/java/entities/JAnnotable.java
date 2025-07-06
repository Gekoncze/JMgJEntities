package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.collections.list.List;

public @Entity interface JAnnotable {
    @Required @Part
    List<JAnnotation> getAnnotations();
    void setAnnotations(List<JAnnotation> annotations);
}
