package SymbolsTable;

import java.util.LinkedHashMap;

import java.util.Map;

public class SymbolsTable {
    private static SymbolsTable instance;
    private final Map<String, Map<String, Object>> symbols = new LinkedHashMap<>();

    private SymbolsTable() {}

    public static SymbolsTable getInstance() {
        if (instance == null) {
            instance = new SymbolsTable();
        }
        return instance;
    }

    public void addSymbol(String key, Map<String, Object> value) {
        symbols.put(key, value);

    }

    public Map<String, Object> getSymbol(String key) {
        return symbols.get(key);
    }

}