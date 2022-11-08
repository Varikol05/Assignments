package com.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Thread {



   public static void main(String[] args) {
        List<Integer>list=Arrays.asList(1,2,3,4,5);
        Consumer<Integer>c=new Sample();
        list.forEach(c);
        //thread.start();package com.assignments;


}}
