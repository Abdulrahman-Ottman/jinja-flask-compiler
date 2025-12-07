parser grammar FlaskExprParser;

options { tokenVocab=FlaskExprLexer; }

program : statement* EOF ;

// Statements can be decorated or plain
statement
    : importstatement          # Import
    | assignment          # Assign
    | returnStmt          # Return
    | expr                # ExprStmt
    | BREAK               # Break
    | CONTINUE            # Continue
    | decorator* functionDef          # FunctionDefstatementment
    | ifstatement               # Ifstatementment
    | forstatement                         # Forstatementment
    ;

// Decorator: @expr
decorator
    : ATSIGN expr
    ;

// Compound statementements
functionDef
    : DEF NAME LPAREN parameters? RPAREN COLON suite
    ;

forstatement
    : FOR NAME IN expr COLON suite
    ;

ifstatement
    : IF expr COLON suite
    ;

suite
    : BLOCKSTART statement* BLOCKEND
    ;


// Import
importstatement  : FROM packageName IMPORT importList ;
packageName : NAME (DOT NAME)* ;
importList  : NAME (COMMA NAME)* ;

// Assignment and return
assignment  : expr ASSIGN expr ;
returnStmt  : RETURN expr? ;

// Parameters
parameters
    : parameter (COMMA parameter)* COMMA?
    ;

parameter
    : NAME
    ;

// Expressions
expr
    : expr DOT NAME                     # Attribute
    | expr LBRACK expr RBRACK           # Subscript
    | expr LPAREN arguments? RPAREN     # FunctionCall
    | expr STAR expr                    # Multiplication
    | expr SLASH expr                   # Division
    | expr PLUS expr                    # Addition
    | expr MINUS expr                   # Subtraction
    | expr (GT | LT | GTE | LTE | EQ | NEQ) expr   # Comparison
    | NAME                              # Var
    | NUMBER                            # Number
    | STRING                            # String
    | TRUE                              # TrueLit
    | FALSE                             # FalseLit
    | NONE                              # NoneLit
    | listExpr                          # List
    | dictionary                        # Dict
    | LPAREN expr RPAREN                # Parens
    ;



// Call arguments (positional + keyword)
arguments
    : arg (COMMA arg)* COMMA?
    ;

arg
    : expr
    | NAME ASSIGN expr
    ;

// Collections
listExpr    : LBRACK (expr (COMMA expr)*)? RBRACK ;
dictionary  : LBRACE (pair (COMMA pair)*)? RBRACE ;
pair        : STRING COLON expr ;