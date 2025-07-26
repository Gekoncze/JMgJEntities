package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Entity class JConstructor extends JMethod {
    public JConstructor() {
    }

    public JConstructor(
        String comment,
        List<JAnnotation> annotations,
        List<JModifier> modifiers,
        List<JBound> bounds,
        JType output,
        String name,
        List<JVariable> input,
        List<Token> implementation
    ) {
        super(
            comment,
            annotations,
            modifiers,
            bounds,
            output,
            name,
            input,
            implementation
        );
    }
}
