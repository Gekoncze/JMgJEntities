package cz.mg.java.entities.interfaces;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.collections.list.List;
import cz.mg.java.entities.JAnnotation;

public @Entity interface JAnnotable {
    @Required @Part
    List<JAnnotation> getAnnotations();
    void setAnnotations(List<JAnnotation> annotations);
}
