package com.codeispassion.codechamp.compiler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeispassion.codechamp.compiler.coderesponse.CodeResponse;
import com.codeispassion.codechamp.compiler.coderesponse.CodeResponseStatus;

@Service
public class CodeService {

    @Autowired
    CodeRepository codeRepository;

    public CodeResponse compileCode(Code code) {
        // codeRepository.findById(null).orElse(null);
        String response = null;
        CodeResponseStatus status = CodeResponseStatus.SUCCESS;
        switch (code.getLanguageType()) {
            case PYTHON:
                response = compilePython(code.getCodeBody());
                break;
            case CPP:
                response = compileCpp(code.getCodeBody());
                break;
            case JAVA:
                response = compileJava(code.getCodeBody());
                break;
            case JS:
                response = compileJs(code.getCodeBody());
                break;
            default:
                response = "invalid request";
                status = CodeResponseStatus.FAIL;
                break;
        }

        return new CodeResponse(code.getId(), status, response);
    }

    private String compilePython(String codeBody) {
        return "default python response";
    }

    private String compileJava(String codeBody) {
        return "default java response";
    }

    private String compileCpp(String codeBody) {
        return "default CPP response";
    }

    private String compileJs(String codeBody) {
        return "default JavaScript response";
    }

}
