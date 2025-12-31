package SymbolsTable;

//import antlr.grammar.flask.ASTStatementsBuilderVisitor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolsTable {
    private static SymbolsTable instance;
    private static SymbolsTable HtmlInstance;
    private final Map<String, Map<String, Object>> FlaskSymbols = new LinkedHashMap<>();
    private final Map<String, Map<String, Object>> HtmlSymbols = new LinkedHashMap<>();


    private SymbolsTable() {}

    public static SymbolsTable getFlaskInstance() {
        if (instance == null) {
            instance = new SymbolsTable();
        }
        return instance;
    }

    public static SymbolsTable getHtmlInstance() {
        if (HtmlInstance == null) {
            HtmlInstance = new SymbolsTable();
        }
        return HtmlInstance;
    }

    public void addFlaskSymbol(String key, Map<String, Object> value) {
        FlaskSymbols.put(key, value);

    }

    public void addHtmlSymbol(String key, Map<String, Object> value) {
        HtmlSymbols.put(key, value);

    }
    public Map<String, Object> getHtmlSymbol(String key) {
        return HtmlSymbols.get(key);
    }
    public void removehtmlkey(String key){
        HtmlSymbols.remove(key);
    }


    public Map<String, Object> getFlaskSymbol (String key){
        Stack<String> temp = new Stack<>();
       // temp.addAll(ASTStatementsBuilderVisitor.scope);

        while(!temp.isEmpty()){
            String searchingScope = temp.pop();
            String searchingKey = searchingScope +"."+ key;
            if (FlaskSymbols.containsKey(searchingKey)){
                return FlaskSymbols.get(searchingKey);
            }
        }

        return null;
    }

    public void clearFlaskST(){ FlaskSymbols.clear();}
    public void clearHtmlST(){ HtmlSymbols.clear();}
}