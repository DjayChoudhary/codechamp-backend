package com.codeispassion.codechamp.compiler.coderesponse;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("coderesponses")
public class CodeResponse {
    @Id
    private String codeResponseId;
    private CodeResponseStatus codeResponseStatus;
    private String codeResponseBody;

    public CodeResponse() {
    }

    public CodeResponse(String codeResponseId, CodeResponseStatus codeResponseStatus, String codeResponseBody) {
        this.codeResponseId = codeResponseId;
        this.codeResponseStatus = codeResponseStatus;
        this.codeResponseBody = codeResponseBody;
    }

    public CodeResponseStatus getCodeResponseStatus() {
        return codeResponseStatus;
    }

    public void setCodeResponseStatus(CodeResponseStatus codeResponseStatus) {
        this.codeResponseStatus = codeResponseStatus;
    }

    public String getCodeResponseBody() {
        return codeResponseBody;
    }

    public void setCodeResponseBody(String codeResponseBody) {
        this.codeResponseBody = codeResponseBody;
    }
}
