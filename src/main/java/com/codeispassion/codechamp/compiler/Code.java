package com.codeispassion.codechamp.compiler;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// @Entity
@Document("codes")
public class Code {
    @Id
    private String id;
    private LanguageType languageType;
    private String codeBody;

    public Code() {
    }

    public Code(String id, LanguageType languageType, String codeBody) {
        this.id = id;
        this.languageType = languageType;
        this.codeBody = codeBody;
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

}
