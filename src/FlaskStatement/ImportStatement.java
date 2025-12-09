package FlaskStatement;

import java.util.List;

public class ImportStatement extends Statement {
    private final List<String> packageParts;   // ex: ["flask", "blueprints"]
    private final List<String> importedNames;  // ex: ["Blueprint", "request"]

    public ImportStatement(List<String> packageParts, List<String> importedNames) {
        this.packageParts = packageParts;
        this.importedNames = importedNames;
    }

    public List<String> getPackageParts() {
        return packageParts;
    }

    public List<String> getImportedNames() {
        return importedNames;
    }
}
