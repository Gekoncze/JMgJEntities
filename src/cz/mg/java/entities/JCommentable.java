package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;

public @Entity interface JCommentable {
    @Required @Part
    String getComment();
    void setComment(String comment);
}
