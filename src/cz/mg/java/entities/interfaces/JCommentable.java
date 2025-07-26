package cz.mg.java.entities.interfaces;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.storage.Value;

public @Entity interface JCommentable {
    @Optional @Value
    String getComment();
    void setComment(String comment);
}
