package com.BS2.Qualifiers.DependenciesInjectionsWithBeanandQualifiers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    @Qualifier("bean1")
    Person person1;

    @Autowired
    @Qualifier("bean2")
    Person person2;

    @Autowired
    @Qualifier("bean3")
    Person person3;


    @GetMapping("/controller/bean/{bean}")
    public String getPerson(@PathVariable String bean){

        if (bean.equals("bean1")){
            return "Person name is "+ person1;
        }else if (bean.equals("bean2")){
            return "Person name is "+ person2;
        }else if (bean.equals("bean3")) {
            return "Person name is "+ person3;
        }
        return  "Not Found";
    }
}
