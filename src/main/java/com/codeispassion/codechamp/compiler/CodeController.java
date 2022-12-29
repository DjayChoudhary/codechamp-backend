package com.codeispassion.codechamp.compiler;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CodeController {

    @Autowired
    CodeService codeService;

    @GetMapping("/test")
    public String getTest() {
        return "Test Date: " + new Date();
    }

    @PostMapping("/compile")
    public String compileCode(@RequestBody Code code) {
        return code.getCompileResult();
    }

    @GetMapping
    public Code getDefaultCode() {
        return new Code("test1", LanguageType.PYTHON, "print('hello')", "hello python result");
    }
}
