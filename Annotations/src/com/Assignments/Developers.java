package com.Assignments;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
int authorId() default 123;
String Authorname() default "keerthana";
String developersupervisor() default "mandra";
String date() default "5/5/22";
String Time() default "6.00 PM";
int version() default 7;
}




@info
class developers{
int authorId;
String Authorname;
String developersupervisor;
String date;
String Time;
int version;
}


