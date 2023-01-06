package com.codeispassion.codechamp.compiler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeispassion.codechamp.compiler.coderesponse.CodeResponse;
import com.codeispassion.codechamp.compiler.coderesponse.CodeResponseRepository;
import com.codeispassion.codechamp.compiler.coderesponse.CodeResponseStatus;

@Service
public class CodeService {

    @Autowired
    CodeRepository codeRepository;

    @Autowired
    CodeResponseRepository codeResponseRepository;

    public CodeResponse compileCode(Code code) {
        // codeRepository.findById(null).orElse(null);
        String response = null;
        CodeResponseStatus status = CodeResponseStatus.SUCCESS;
        switch (code.getLanguageType()) {
            case PYTHON:
                response = compilePython(code.getCodeBody());
                break;
            case CPP:
            case C:
                response = compileCpp(code.getCodeBody());
                break;
            case JAVA:
                response = compileJava(code.getCodeBody());
                break;
            case JS:
            case JAVASCRIPT:
                response = compileJs(code.getCodeBody());
                break;
            default:
                response = "invalid request";
                status = CodeResponseStatus.FAIL;
                break;
        }

        codeRepository.save(code);

        CodeResponse cr = new CodeResponse(code.getId(), status, response);
        codeResponseRepository.save(cr);
        return cr;
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

    public List<CodeResponse> getAllCodeResponses() {
        return codeResponseRepository.findAll();
    }

}
