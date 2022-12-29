package com.codeispassion.codechamp.compiler;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Code {
    @Id
    private String id;
    private LanguageType languageType;
    private String codeBody;
    private String compileResult;

    public Code() {
        this.compileResult = "Dummy Compile Result";
    }

    public Code(String id, LanguageType languageType, String codeBody, String compileResult) {
        this.id = id;
        this.languageType = languageType;
        this.codeBody = codeBody;
        this.compileResult = compileResult;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    public String getCodeBody() {
        return codeBody;
    }

    public void setCodeBody(String codeBody) {
        this.codeBody = codeBody;
    }

    public String getCompileResult() {
        return compileResult;
    }

    public void setCompileResult(String compileResult) {
        this.compileResult = compileResult;
    }

}
