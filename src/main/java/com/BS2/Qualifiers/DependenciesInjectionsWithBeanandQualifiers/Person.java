package com.BS2.Qualifiers.DependenciesInjectionsWithBeanandQualifiers;


import lombok.Data;

@Data
public class Person {
    String name;

    @Override
    public String toString(){
        return name;
    }
}
