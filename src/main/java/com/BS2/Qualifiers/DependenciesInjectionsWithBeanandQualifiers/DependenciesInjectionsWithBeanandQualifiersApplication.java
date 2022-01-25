package com.BS2.Qualifiers.DependenciesInjectionsWithBeanandQualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependenciesInjectionsWithBeanandQualifiersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependenciesInjectionsWithBeanandQualifiersApplication.class, args);
	}
	@Bean("bean1")
	public Person Person1(){
		Person p1 = new Person();
		p1.setName("bean1");
		return p1;
	}
	@Bean ("bean2")
	public Person Person2(){
		Person p2 = new Person();
		p2.setName("bean2");
		return p2;
	}
	@Bean("bean3")
	public Person Person3(){
		Person p3 = new Person();
		p3.setName("bean3");
		return p3;
	}

}
