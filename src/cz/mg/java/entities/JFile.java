package cz.mg.java.entities;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Optional;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Part;
import cz.mg.annotations.storage.Value;
import cz.mg.collections.list.List;

import java.nio.file.Path;

public @Entity class JFile implements JCommentable {
    private Path path;
    private JPackageLine packageLine;
    private List<JImport> imports = new List<>();
    private JStructure structure;
    private String comment;

    public JFile() {
    }

    public JFile(
        Path path,
        JPackageLine packageLine,
        List<JImport> imports,
        JStructure structure,
        String comment
    ) {
        this.path = path;
        this.packageLine = packageLine;
        this.imports = imports;
        this.structure = structure;
        this.comment = comment;
    }

    @Required @Value
    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    @Optional @Part
    public JPackageLine getPackageLine() {
        return packageLine;
    }

    public void setPackageLine(JPackageLine packageLine) {
        this.packageLine = packageLine;
    }

    @Required @Part
    public List<JImport> getImports() {
        return imports;
    }

    public void setImports(List<JImport> imports) {
        this.imports = imports;
    }

    @Required @Part
    public JStructure getStructure() {
        return structure;
    }

    public void setStructure(JStructure structure) {
        this.structure = structure;
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
