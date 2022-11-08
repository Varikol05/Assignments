package com.Assignments;

import java.lang.annotation.Annotation;

public class SecondDevelopers {
public static void main(String[] args) {
developers obj=new developers();
Class<? extends developers> n=obj.getClass();
Annotation anno=n.getAnnotation(info.class);
info k=(info)anno;
System.out.println(k.authorId());
System.out.println(k.Authorname());
System.out.println(k.date());
System.out.println(k.developersupervisor());
System.out.println(k.Time());
System.out.println(k.version());
}
}


