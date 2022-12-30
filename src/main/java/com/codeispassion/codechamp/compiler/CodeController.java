package com.codeispassion.codechamp.compiler;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeispassion.codechamp.compiler.coderesponse.CodeResponse;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CodeController {

    @Autowired
    CodeService codeService;

    @GetMapping("/test")
    public String getTest() {
        return "Test Date: " + new Date();
    }

    @GetMapping("/response")
    public CodeResponse getResponse() {
        return new CodeResponse();
    }

    @PostMapping("/compile")
    public CodeResponse compileCode(@RequestBody Code code) {
        return codeService.compileCode(code);
    }

    @GetMapping("/code")
    public Code getDefaultCode() {
        return new Code("test1", LanguageType.PYTHON, "print('hello')");
    }
}
