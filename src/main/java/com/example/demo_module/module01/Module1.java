package com.example.demo_module.module01;

import com.example.demo_module.module02.Module2;
import com.example.demo_module.module03.Module3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Module1 {

    private Module2 module2;
    private Module3 module3;

    public Module1(Module2 module2, Module3 module3) {
        this.module2 = module2;
        this.module3 = module3;
    }

    @GetMapping("/call")
    public void doSth(){
        module2.doSth();
        module3.doSth();
    }
}
